package com.chris.models.service;

import java.util.List;

import com.chris.models.entidad.Reclamo;



public interface IReclamoService {

	public List<Reclamo> listarReclamos();
	
	public Reclamo buscarXID(Long id);
	
	public Reclamo guardarReclamo(Reclamo reclamo);
}

