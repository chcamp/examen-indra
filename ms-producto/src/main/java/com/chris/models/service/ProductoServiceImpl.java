package com.chris.models.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chris.models.dao.ProductoDao;
import com.chris.models.entidad.Producto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private ProductoDao productoDao;

	@Override	
	public List<Producto> listarProductos() {
		
		return  (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto buscarXID(Long id) {
		
		return productoDao.findById(id).orElse(null);
	}
	
	
}
