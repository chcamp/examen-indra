package com.chris.models.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.chris.models.dao.ClienteDao;
import com.chris.models.entidad.Cliente;
import com.chris.models.entidad.Producto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private ClienteDao clienteDao;

	@Autowired
	private RestTemplate clienteRest;

	/*
	 * @Autowired private RestTemplate restTemplate;
	 */

	@Override
	public List<Cliente> listarClientes() {

		// List<Producto> productos =
		// Arrays.asList(clienteRest.getForObject("http://localhost:8182/api/listaproductos",
		// Producto[].class));

		return (List<Cliente>) clienteDao.findAll();

	}

	@Override
	public Cliente buscarXID(Long id) {

		return clienteDao.findById(id).orElse(null);
	}

}
