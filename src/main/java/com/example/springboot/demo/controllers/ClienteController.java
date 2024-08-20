package com.example.springboot.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.dao.ClienteDaoImple;

@Controller
public class ClienteController {

	@Autowired
	@Qualifier("clienteDaoJPA") // cuando hay mas de una implementacion de una interfas
	private ClienteDaoImple clienteDaoImple;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)

	public String listar(Model model) {

		model.addAttribute("titulo", "listado de clientes");

		model.addAttribute("cliente", clienteDaoImple.finAll());

		return "listar";

	}

}
