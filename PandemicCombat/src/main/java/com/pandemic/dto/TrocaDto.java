package com.pandemic.dto;

import javax.persistence.Column;

import com.pandemic.model.Hospital;

public class TrocaDto {
	
	private Long hospitalDoa;
	
	private Long hospitalRecebe;
	
	private int numMedicos;
	
	private int numEnfermeiros;
	
	private int numRespiradores;
	
	private int numTomografo;
	
	private int numAmbulancia;
	
	public TrocaDto() {
		
	}
	
	//Função para calcular o total de recursos da troca entre os hospitais
	//Neste caso só ta calculando de um hospital
	public int totalRecursoDaTroca() {
		return 
				(this.numMedicos * 3) +
				(this.numEnfermeiros * 3) +
				(this.numRespiradores * 5) +
				(this.numTomografo * 12) + 
				(this.numAmbulancia * 10);
	}

	public TrocaDto(Long hospitalDoa, Long hospitalRecebe, int numMedicos, int numEnfermeiros, int numRespiradores,
			int numTomografo, int numAmbulancia) {
		super();
		this.hospitalDoa = hospitalDoa;
		this.hospitalRecebe = hospitalRecebe;
		this.numMedicos = numMedicos;
		this.numEnfermeiros = numEnfermeiros;
		this.numRespiradores = numRespiradores;
		this.numTomografo = numTomografo;
		this.numAmbulancia = numAmbulancia;
	}

	public Long getHospitalDoa() {
		return hospitalDoa;
	}

	public void setHospitalDoa(Long hospitalDoa) {
		this.hospitalDoa = hospitalDoa;
	}

	public Long getHospitalRecebe() {
		return hospitalRecebe;
	}

	public void setHospitalRecebe(Long hospitalRecebe) {
		this.hospitalRecebe = hospitalRecebe;
	}

	public int getNumMedicos() {
		return numMedicos;
	}

	public void setNumMedicos(int numMedicos) {
		this.numMedicos = numMedicos;
	}

	public int getNumEnfermeiros() {
		return numEnfermeiros;
	}

	public void setNumEnfermeiros(int numEnfermeiros) {
		this.numEnfermeiros = numEnfermeiros;
	}

	public int getNumRespiradores() {
		return numRespiradores;
	}

	public void setNumRespiradores(int numRespiradores) {
		this.numRespiradores = numRespiradores;
	}

	public int getNumTomografo() {
		return numTomografo;
	}

	public void setNumTomografo(int numTomografo) {
		this.numTomografo = numTomografo;
	}

	public int getNumAmbulancia() {
		return numAmbulancia;
	}

	public void setNumAmbulancia(int numAmbulancia) {
		this.numAmbulancia = numAmbulancia;
	}
	
	
	

}
