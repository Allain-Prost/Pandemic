package com.pandemic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pandemic.dto.TrocaDto;
import com.pandemic.model.Hospital;
import com.pandemic.repository.HospitalRepository;

@Service
public class TrocaService {

	@Autowired
	private HospitalRepository hospitalRepository;
	
	//Função que realiza a troca entre hospitais 
	public ResponseEntity<?> realizarTroca(TrocaDto trocaDto) {
		Hospital hospipalRecebe = hospitalRepository.getOne(trocaDto.getHospitalRecebe());
		Hospital hospitalDoa = hospitalRepository.getOne(trocaDto.getHospitalDoa());
		
		// Hospital Recebe
		
		hospipalRecebe.getRecursos().adicionarRecursos(trocaDto.getNumMedicos(),
					trocaDto.getNumEnfermeiros(), 
					trocaDto.getNumRespiradores(), 
					trocaDto.getNumTomografo(),
					trocaDto.getNumAmbulancia());
		
		//Hospital Doa
		
		hospitalDoa.getRecursos().removerRecursos(trocaDto.getNumMedicos(),
				trocaDto.getNumEnfermeiros(), 
				trocaDto.getNumRespiradores(), 
				trocaDto.getNumTomografo(),
				trocaDto.getNumAmbulancia());
		
		//Fim
		
		//Verificar quais recursos estão sendo trocados 
		//Calcular peso dos recursos que estão sendo mandados 
		//Somar recursos que deem o mesmo peso
		
		
		
		hospitalDoa.getRecursos().setTotalRecurso(hospitalDoa.getRecursos().totalRecurso());
		hospipalRecebe.getRecursos().setTotalRecurso(hospipalRecebe.getRecursos().totalRecurso());
		
		hospitalRepository.save(hospitalDoa);
		hospitalRepository.save(hospipalRecebe);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
