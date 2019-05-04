package com.Shopping.repository;

import org.springframework.data.repository.CrudRepository;

import com.Shopping.models.Producto;

public interface ProductoRepository extends CrudRepository <Producto, Integer> { 

}
