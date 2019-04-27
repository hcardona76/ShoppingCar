package com.Shopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Shopping.models.Cliente;
import com.Shopping.repository.Clienterepository;
import com.Shopping.repository.*;


@Controller // Clase controlador
@ComponentScan(basePackages = "com.Shopping") //Paquete que se utilizara
@RequestMapping(path="/Cliente") //Llamarlo pos

public class clientecontroller {
	
	@Autowired
	private Clienterepository Clienterepository;
	
	@GetMapping(path="/addCliente") // Map ONLY GET Requests
	public @ResponseBody String addNewCliente (
			@RequestParam long cedula,
			@RequestParam String nombrecompleto,
			@RequestParam String telefono,
			@RequestParam String direccion,
			@RequestParam String celular,
			@RequestParam String tipo) {
		
		
		Clienterepository.save(new 
				Cliente(cedula, nombrecompleto,telefono,direccion,celular,tipo
						));
		
		
		return "Guardado";
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
	}	 


	
	@GetMapping(path="/getallClientes")
	public @ResponseBody Iterable<Cliente> getAllClientes() {
		// This returns a JSON or XML with the users
		return Clienterepository.findAll();		
		
	}
	
	@PostMapping(path="/updateCliente") 
	public @ResponseBody ResponseEntity<String> updateNewCliente (
			@RequestBody Cliente cliente) {
		Clienterepository.save(cliente);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
}
