package com.Shopping.repository;

import org.springframework.data.repository.CrudRepository;

import com.Shopping.models.Cliente;
import com.Shopping.models.Pedido;

public interface Pedidorepository extends CrudRepository<Pedido, Integer> {
	
	  
	
}	
