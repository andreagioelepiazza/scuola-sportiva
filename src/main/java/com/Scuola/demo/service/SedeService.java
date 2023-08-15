package com.Scuola.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Scuola.demo.model.Sede;
import com.Scuola.demo.repository.SedeRepository;

@Service
public class SedeService {
	
	
	@Autowired
	SedeRepository sr;
	
	public List<Sede> getAllSedi() {

		return (List<Sede>) sr.findAll();
	}

	
	public Sede find(Long id) {
		Sede a = new Sede();
		if (sr.findById(id)!=null) {
		return sr.findById(id).orElse(a);	
		}
		return a;
	}
}
