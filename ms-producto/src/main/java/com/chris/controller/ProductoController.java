package com.chris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chris.models.entidad.Producto;
import com.chris.models.service.IProductoService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;
		
		@GetMapping("/listaproductos")
		public List<Producto> getProductos(){
			return  productoService.listarProductos();
				
		}
		
		@GetMapping("/listaproductos/{id}")
		public Producto productoXID(@PathVariable Long id){			
			
				return productoService.buscarXID(id);
			
		}
		
		
}
