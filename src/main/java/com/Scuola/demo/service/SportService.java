package com.Scuola.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Scuola.demo.model.Sport;
import com.Scuola.demo.repository.SportRepository;


@Service
public class SportService {

	@Autowired
	SportRepository pr;

	public ArrayList<Sport> getAllSports() {

		return (ArrayList<Sport>) pr.findAll();
	}

	public Sport getSport(Long id) {
		Optional<Sport> sport = this.pr.findById(id);
		if (sport.isPresent()) {
			return sport.get();
		} else {
			return null;
		}

	}
	
	public Sport findById(Long id) {
		return pr.findById(id).orElse(null);
	}

}
