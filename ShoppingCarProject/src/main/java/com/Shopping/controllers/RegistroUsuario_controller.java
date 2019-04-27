package com.Shopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Shopping.models.RegistroUsuario;
import com.Shopping.repository.Clienterepository;
import com.Shopping.repository.RegistroUsuario_repository;


@Controller
@RequestMapping(path="/RegistroUsuario")
@ComponentScan(basePackages="com.Shopping")
public class RegistroUsuario_controller {
	
	@GetMapping(path="/Registrar") // Map ONLY GET Requests
	public @ResponseBody String addNewCliente (
			@RequestParam long cedula,
			@RequestParam String nombrecompleto,
			@RequestParam long telefono,
			@RequestParam long telefono2,
			@RequestParam String direccion,
			@RequestParam String ciudad,
			@RequestParam String tipo) {
		
		
		return "Guardado";
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
	}	 
	
}
