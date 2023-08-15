package com.Scuola.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Scuola.demo.model.Sede;
import com.Scuola.demo.repository.SedeRepository;
import com.Scuola.demo.service.SedeService;

@Controller
public class SedeController {
	
	@Autowired
	SedeService sr;
	
	@RequestMapping(value="/sedi", method = RequestMethod.GET)
	public String listaSedi(Model model) {

		for (Sede s : sr.getAllSedi()) {
			System.out.println(s.getCitta());
			System.out.println(s.getVia());
		}
		
		model.addAttribute("sedi", sr.getAllSedi());
		
		return "listaSedi";
		
	}
	
	@RequestMapping(value="/sede/{id}", method = RequestMethod.GET)
	public String sede (@PathVariable Long id, Model model) {

		model.addAttribute("sede",sr.find(id));
		
		return "sede";
		
	}
	

}
