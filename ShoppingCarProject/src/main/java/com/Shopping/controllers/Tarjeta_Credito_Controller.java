package com.Shopping.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Shopping.models.Cliente;
import com.Shopping.models.Forma_pago;
import com.Shopping.repository.Forma_Pago_repository;


@Controller
@RequestMapping(path="/FormaPago")
@ComponentScan(basePackages="com.Shopping")
public class Tarjeta_Credito_Controller {
		
	
	@Autowired
	private Forma_Pago_repository FormaPagorepository;
	
	
	@GetMapping(path="/getallFormaPago")
	public @ResponseBody Iterable<Forma_pago> getAllClientes() {
		// This returns a JSON or XML with the users
		return FormaPagorepository.findAll();
		
	}
	
}
