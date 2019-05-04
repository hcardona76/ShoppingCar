package com.Shopping.repository;

import org.springframework.data.repository.CrudRepository;



import com.Shopping.controllers.RegistroUsuario_controller;
import com.Shopping.models.RegistroUsuario;

public interface RegistroUsuario_repository extends CrudRepository<RegistroUsuario,Integer>  {

}
