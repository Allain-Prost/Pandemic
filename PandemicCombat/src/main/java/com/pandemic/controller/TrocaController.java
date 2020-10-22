package com.pandemic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pandemic.dto.TrocaDto;
import com.pandemic.service.HospitalService;
import com.pandemic.service.TrocaService;

//Controler responsável pela troca de recursos entre os hospitais

@RestController
@RequestMapping("/troca")
public class TrocaController {
	
	@Autowired
	private TrocaService trocaService;
	
	@PostMapping
	public ResponseEntity<?> trocarRecursos(@RequestBody TrocaDto trocaDto) {
		return trocaService.realizarTroca(trocaDto);
	}
	

}
