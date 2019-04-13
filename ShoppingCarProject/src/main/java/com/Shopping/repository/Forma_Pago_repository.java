package com.Shopping.repository;

import org.springframework.data.repository.CrudRepository;
import com.Shopping.models.Forma_pago;
import java.util.*;

public interface Forma_Pago_repository extends CrudRepository<Forma_pago,Integer>  {
	
	List<Forma_pago> getListByName(String name);
	
}
