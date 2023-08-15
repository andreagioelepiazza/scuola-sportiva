package com.Scuola.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recensione {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private String titolo;
	private String recensione;
	
	
	
	public Recensione(String nome, String titolo, String recensione) {
		this.nome = nome;
		this.titolo = titolo;
		this.recensione = recensione;
	}
	
	public Recensione () {
		
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


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public String getRecensione() {
		return recensione;
	}


	public void setRecensione(String recensione) {
		this.recensione = recensione;
	}
	
	
	
	

}
