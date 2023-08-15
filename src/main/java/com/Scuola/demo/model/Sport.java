package com.Scuola.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	 private String nomeSport;
	 
	 public Sport () {
		 
	 }

	public Sport(Long id, String nomeSport) {
		super();
		this.id = id;
		this.nomeSport = nomeSport;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeSport() {
		return nomeSport;
	}

	public void setNomeSport(String nomeSport) {
		this.nomeSport = nomeSport;
	}

	 
	 
	
	
	

}
