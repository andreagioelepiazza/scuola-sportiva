package com.Scuola.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Scuola.demo.model.Recensione;
import com.Scuola.demo.repository.RecensioneRepository;



@Service
public class RecensioneService {
	
	@Autowired
	RecensioneRepository rr;
	
	public ArrayList<Recensione> getAllRecensioni() {

		return (ArrayList<Recensione>) rr.findAll();
	}

	public Recensione getSport(Long id) {
		Optional<Recensione> recensione = this.rr.findById(id);
		if (recensione.isPresent()) {
			return recensione.get();
		} else {
			return null;
		}

	}
	
	public Recensione findById(Long id) {
		return rr.findById(id).orElse(null);
	}
	
	public void save(Recensione a) {
		
		if (!a.getNome().isEmpty() && a.getNome()!=null) {
			rr.save(a);
		}
		
	}
	
	public String insRecensioneEffettuata(String nome, String titolo, String recensione) {

		Recensione p = new Recensione(nome, titolo, recensione);

		ArrayList<Recensione> list = (ArrayList<Recensione>) rr.findAll();

		for (Recensione r : list) {
			if (r.getNome().equals(nome)) {
				return "registrazionedue";
			}

		}
		rr.save(p);

		return "redirect:/recensioni";
	}


}
