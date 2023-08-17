package com.Scuola.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Scuola.demo.model.Recensione;
import com.Scuola.demo.service.RecensioneService;


@Controller
public class RecensioneController {
	
	@Autowired
	RecensioneService sr;

	//Metodo che porta a una pagina in cui sono mostrati gli oggetti di tipo "Recensione"
	@RequestMapping(value="/recensioni", method = RequestMethod.GET)
	public String lista(Model model) {
	
		model.addAttribute("recensioni", sr.getAllRecensioni());
		
		return "recensioni";
		
	}

	/*Metodo che prende i dati inseriti dall'utente per creare un nuovo oggetto di tipo "Recensione"
	e reindirizza alla pagina in cui sono mostrati gli oggetti di tipo "Recensione" */
	@RequestMapping(value="/recensione/create", method = RequestMethod.POST)
	public String insDatiEffettuata(String nome, String titolo, String recensione) {
		
		return sr.insRecensioneEffettuata(nome, titolo, recensione);
	}
	

}
