package com.Shopping.controllers;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.Shopping.repository.Forma_Pago_repository;

@Controller
@RequestMapping(path="/Forma_Pago")
@ComponentScan(basePackages="com.Shopping")
public class Forma_Pago_controller {
	
	private Forma_Pago_repository FormaPagoRepository;
	
	@GetMapping(path="/getFormaPago")
	public @ResponseBody Forma_Pago_repository getAllFormaPago() {
		return FormaPagoRepository;
	}
	
	@GetMapping(path="/ValideFormapago") // Map ONLY GET Requests
	public @ResponseBody String ValideFormapago (
			@RequestParam int idRefTiket,
			@RequestParam int FormaPago) {
				
		//Validar el clente
		//validar el ticket
		//validar la forma de pago y continuar
		return null;
	}

}