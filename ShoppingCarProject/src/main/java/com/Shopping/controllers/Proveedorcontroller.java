package com.Shopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Shopping.models.*;
import com.Shopping.repository.Proveedorrepository;


@Controller
@RequestMapping(path="/Proveedor")
@ComponentScan(basePackages="com.Shopping")

public class Proveedorcontroller {
@Autowired
private Proveedorrepository Proveedorrepository;

@GetMapping(path="/addproveedor") // Map ONLY GET Requests
public @ResponseBody String addNewProveedor (
		@RequestParam int ID,
		@RequestParam String Razon_Social,
		@RequestParam int RUT,
		@RequestParam int Telefono_Contacto,
		@RequestParam String Direccion,
		@RequestParam String Horario_Disponibilidad,
		@RequestParam String Contacto,
		@RequestParam String Productos) {
	// @ResponseBody means the returned String is the response, not a view name
	// @RequestParam means it is a parameter from the GET or POST request

	Proveedorrepository.save(new 
			Proveedor(ID, Razon_Social,RUT,Telefono_Contacto,Direccion,Horario_Disponibilidad,Contacto,Productos
					));
	
	return "Saved";
}

	@GetMapping(path="/getallproveedores")
	public @ResponseBody Iterable<Proveedor> getAllProveedor() {
		// This returns a JSON or XML with the users
		return Proveedorrepository.findAll();		
		
	}
	

	
}
