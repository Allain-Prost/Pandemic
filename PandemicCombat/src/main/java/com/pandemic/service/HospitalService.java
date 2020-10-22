package com.pandemic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.pandemic.model.Hospital;
import com.pandemic.repository.HospitalRepository;

@Service
public class HospitalService {

	@Autowired
	private HospitalRepository hospitalRepository;

	//Função reponsável por salvar os dados do hospital no banco de dados
	public ResponseEntity<Hospital> criarHospital(Hospital hospital) {
		Hospital criarHospital = hospitalRepository.save(hospital);
		return new ResponseEntity<Hospital> (criarHospital, HttpStatus.OK);
	}

	//Função responsável por listar todos os hospitais cadastrado no banco de dados
	public List<Hospital> recuperarHospitais() {
		return hospitalRepository.findAll();
	}

	//Função responsável por listar hospital atráves de seu número identificador
	public Optional<Hospital> recuperarHospitalId(Long hospitalId) {
		return hospitalRepository.findById(hospitalId);
	}
	
	//Função responsável por deletar um hospital atráves de seu número identificador
	public void deletarHospital(Long hospitalId) {
		 hospitalRepository.deleteById(hospitalId);
	}
	
	
	
	
}
