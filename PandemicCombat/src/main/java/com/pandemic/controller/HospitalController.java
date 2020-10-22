package com.pandemic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pandemic.model.Hospital;
import com.pandemic.service.HospitalService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hospitais")
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	//Requisição para criação de um novo hospital
	@PostMapping("/novo")
	public ResponseEntity<Hospital> criarHospital(@RequestBody Hospital hospital){
		return hospitalService.criarHospital(hospital);
	}
	
	//Requisição para listar todos os hospitais
	@GetMapping
	public List<Hospital> recuperarHospitais(){
		return hospitalService.recuperarHospitais();
	}
	
	//Requisição para identifar um hospital através de seu número identificador
	@GetMapping("/{hospitalId}")
	public Optional<Hospital> recuperarHospitalId(@PathVariable Long hospitalId){
		return hospitalService.recuperarHospitalId(hospitalId);
	}
	
	//Requisição para deletar um hospital através de seu número identificador
	@DeleteMapping(value = "/{hospitalId)")
	public void deletarHospital(@PathVariable Long hospitalId) {
		hospitalService.deletarHospital(hospitalId);
	}
	

}
