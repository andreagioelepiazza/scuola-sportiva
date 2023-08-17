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
	
	//Metodo che porta ad una pagina che mostra una lista degli oggetti di tipo "Istruttore"
	@RequestMapping(value="/istruttori", method = RequestMethod.GET)
	public String listaIstruttori(Model model) {

		model.addAttribute("istruttori", is.getAllIstruttori());
		
		return "listaIstruttori";
		
	}
	
	//Metodo che porta a una pagina che mostra dettagli di un singolo oggetto di tipo "Istruttore"
	@RequestMapping(value="/istruttore/{id}", method = RequestMethod.GET)
	public String istruttore(@PathVariable Long id, Model model) {

		model.addAttribute("istruttore",is.find(id));
		
		return "istruttore";
		
	}

}
