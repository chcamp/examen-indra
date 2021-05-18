package com.chris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chris.models.entidad.Cliente;
import com.chris.models.service.IClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	private IClienteService clienteService;

	@GetMapping("/listarclientes")
	public List<Cliente> getProductos() {
		return clienteService.listarClientes();

	}

	@GetMapping("/listarclientes/{id}")
	public Cliente clienteXID(@PathVariable Long id) {

		return clienteService.buscarXID(id);

	}

}
