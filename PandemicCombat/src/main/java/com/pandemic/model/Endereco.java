package com.pandemic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "logradouro")
    private String logradouro;
    
	@Column(name = "bairro")
    private String bairro;
    
	@Column(name = "cidade")
    private String cidade;
    
	@Column(name = "numero")
    private int numero;
    
	@Column(name = "complemento")
    private String complemento;
    
	@Column(name = "cep")
    private String cep;
    
	@Column(name = "latitude")
    private String latitude;
    
	@Column(name = "longitudade")
    private String longitudade;
    
 
	public Endereco() {	
	
	}
	
	public Endereco( String logradouro, String bairro,String cidade, int numero, String complemento, String cep, String latitude, String longitudade) {
		super();
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.latitude = latitude;
		this.longitudade = longitudade;
	}
  

	public String getLogradouro() {
		return logradouro;
    }
    
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
    }
    
	public String getBairro() {
		return bairro;
    }
    
	public void setBairro(String bairro) {
		this.bairro = bairro;
    }
    
	public int getNumero() {
		return numero;
    }
    
	public void setNumero(int numero) {
		this.numero = numero;
    }
    
	public String getComplemento() {
		return complemento;
    }
    
	public void setComplemento(String complemento) {
		this.complemento = complemento;
    }
    
	public String getCep() {
		return cep;
    }
    
	public void setCep(String cep) {
		this.cep = cep;
    }
    
	public String getLatitude() {
		return latitude;
    }
    
	public void setLatitude(String latitude) {
		this.latitude = latitude;
    }
    
	public String getLongitudade() {
		return longitudade;
    }
    
	public void setLongitudade(String longitudade) {
		this.longitudade = longitudade;
    }
    

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

    
}