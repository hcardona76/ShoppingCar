package com.Shopping.controllers;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}