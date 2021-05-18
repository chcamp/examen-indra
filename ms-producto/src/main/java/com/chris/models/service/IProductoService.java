package com.chris.models.service;

import java.util.List;

import com.chris.models.entidad.Producto;



public interface IProductoService {

	public List<Producto> listarProductos();
	
	public Producto buscarXID(Long id);
}

