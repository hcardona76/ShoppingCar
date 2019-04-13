package com.Shopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Clase controlador
@ComponentScan(basePackages = "com.Shopping") //Paquete que se utilizara
@RequestMapping(path="/pos") //Llamarlo pos

public class clientecontroller {
	
	
	@GetMapping(path="/addCliente") // Map ONLY GET Requests
	public @ResponseBody String addNewCliente (
			@RequestParam long cedula,
			@RequestParam String nombrecompleto) {
		return "Saved";
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
	
}
	
}
