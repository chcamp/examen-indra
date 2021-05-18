package com.chris.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chris.models.entidad.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{
	
	
}


