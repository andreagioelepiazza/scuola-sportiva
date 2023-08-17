package com.Scuola.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Scuola.demo.model.Istruttore;
import com.Scuola.demo.model.Sport;
import com.Scuola.demo.service.IstruttoreService;
import com.Scuola.demo.service.SportService;



@Controller
public class SportController {
	
	@Autowired
	SportService ss;
	@Autowired
	IstruttoreService is;

	//Metodo che porta alla pagina principale
	@RequestMapping(value="/firstPage", method = RequestMethod.GET)
	public String firstPage() {
		
		return "index";
	}
	
	
	//Metodo che porta ad una pagina che mostra una lista degli oggetti di tipo "Sport"
	@RequestMapping(value="/sport", method = RequestMethod.GET)
	public String lista(Model model) {
	
		model.addAttribute("sports", ss.getAllSports());
		
		return "listaSport";
		
	}
	
	
	
	
	
	
	

}
