package com.chris.models.service;

import java.util.List;

import com.chris.models.entidad.Cliente;



public interface IClienteService {

	public List<Cliente> listarClientes();
	
	public Cliente buscarXID(Long id);
	

}

