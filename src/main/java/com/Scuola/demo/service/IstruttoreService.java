package com.Scuola.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Scuola.demo.model.Istruttore;
import com.Scuola.demo.repository.IstruttoreRepository;


@Service
public class IstruttoreService {
	
	
	@Autowired
	IstruttoreRepository ir;
	
	public List<Istruttore> getAllIstruttori() {

		return (List<Istruttore>) ir.findAll();
	}

	
	public Istruttore find(Long id) {
		Istruttore a = new Istruttore();
		if (ir.findById(id)!=null) {
		return ir.findById(id).orElse(a);	
		}
		return a;
	}

}
