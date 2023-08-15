package com.Scuola.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Scuola.demo.model.Istruttore;
import com.Scuola.demo.service.IstruttoreService;


@Controller
public class IstruttoreController {
	
	@Autowired
	IstruttoreService is;
	
	
	@RequestMapping(value="/istruttori", method = RequestMethod.GET)
	public String listaIstruttori(Model model) {

		model.addAttribute("istruttori", is.getAllIstruttori());
		
		return "listaIstruttori";
		
	}
	
	@RequestMapping(value="/istruttore/{id}", method = RequestMethod.GET)
	public String istruttore(@PathVariable Long id, Model model) {

		model.addAttribute("istruttore",is.find(id));
		
		return "istruttore";
		
	}

}
