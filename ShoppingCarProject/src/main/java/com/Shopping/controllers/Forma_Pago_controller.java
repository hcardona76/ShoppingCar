package com.Shopping.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Shopping.repository.Tarjeta_Credito_repository;

@Controller
@RequestMapping(path="/Forma_Pago")
@ComponentScan(basePackages="com.Shopping")
public class Forma_Pago_controller {
	private Tarjeta_Credito_repository addNewForma_Pago;
	
	
	public @ResponseBody int Tarjeta_Credito(String FilialTarjeta,long NumTarjeta,int vencimiento,int Verificacion,int ticket) {
		return Tarjeta_Credito(null, 0, 0, 0, 0);
		
	}
}