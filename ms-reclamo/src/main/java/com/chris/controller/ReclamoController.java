package com.chris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chris.models.entidad.Reclamo;
import com.chris.models.service.IReclamoService;

@RestController
@RequestMapping("/api")
public class ReclamoController {

	@Autowired
	private IReclamoService reclamoService;

	@GetMapping("/reclamos")
	public List<Reclamo> getProductos() {
		return reclamoService.listarReclamos();

	}

	@GetMapping("/reclamos/{id}")
	public Reclamo reclamoXID(@PathVariable Long id) {

		return reclamoService.buscarXID(id);

	}

	@PostMapping("/reclamos")
	public Reclamo crearReclamo(@RequestBody Reclamo reclamo) {
		return reclamoService.guardarReclamo(reclamo);
	}

}
