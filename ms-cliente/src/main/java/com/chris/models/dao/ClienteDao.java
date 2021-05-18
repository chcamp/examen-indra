package com.chris.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chris.models.entidad.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long>{
	
	
}


