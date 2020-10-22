package com.pandemic.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Recurso {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "percentual_ocupacao")
	private int percentualDeOcupacao;
	
	@Column(name = "num_medicos")
	private int numMedicos;
	
	@Column(name = "num_enfermeiros")
	private int numEnfermeiros;
	
	@Column(name = "num_respiradores")
	private int numRespiradores;
	
	@Column(name = "num_tomografo")
	private int numTomografo;
	
	@Column(name = "num_ambulancia")
	private int numAmbulancia;
	
	@Column(name = "total_recurso")
	private int totalRecurso;
	
	public int totalRecurso() {
		return 
				(this.numMedicos * 3) +
				(this.numEnfermeiros * 3) +
				(this.numRespiradores * 5) +
				(this.numTomografo * 12) + 
				(this.numAmbulancia * 10);
	}
	
	public void adicionarRecursos(int numMedicos, int numEnfermeiros, int numRespiradores, int numTomografo, int numAmbulancia){
		this.numMedicos += numMedicos;
		this.numEnfermeiros += numEnfermeiros;
		this.numRespiradores += numRespiradores;
		this.numTomografo += numTomografo;
		this.numAmbulancia += numAmbulancia;
	}
	
	public void removerRecursos(int numMedicos, int numEnfermeiros, int numRespiradores, int numTomografo, int numAmbulancia){
		this.numMedicos -= numMedicos;
		this.numEnfermeiros -= numEnfermeiros;
		this.numRespiradores -= numRespiradores;
		this.numTomografo -= numTomografo;
		this.numAmbulancia -= numAmbulancia;
	}
	
	

	public int getPercentualDeOcupacao() {
		return percentualDeOcupacao;
	}

	public void setPercentualDeOcupacao(int percentualDeOcupacao) {
		this.percentualDeOcupacao = percentualDeOcupacao;
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


	public int getTotalRecurso() {
		return totalRecurso;
	}


	public void setTotalRecurso(int totalRecurso) {
		this.totalRecurso = totalRecurso;
	}
	
	
	

}
