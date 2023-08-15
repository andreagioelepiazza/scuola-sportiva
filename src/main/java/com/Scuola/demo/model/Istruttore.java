package com.Scuola.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Istruttore {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private String cognome;
	private String sport;
	private int eta;
	
	
	
	public Istruttore () {
		
	}
	
	public Istruttore (String nome, String cognome, String sport, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.sport = sport;
		this.eta = eta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public void setSport (String sport) {
		this.sport = sport;
	}
	
	public String getSport () {
		return sport;
	}

	
	

}
