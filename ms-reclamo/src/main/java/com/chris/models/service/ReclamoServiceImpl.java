package com.chris.models.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chris.models.dao.ReclamoDao;
import com.chris.models.entidad.Reclamo;

@Service
public class ReclamoServiceImpl implements IReclamoService {

	@Autowired
	private ReclamoDao reclamoDao;

	@Override
	public List<Reclamo> listarReclamos() {

		return (List<Reclamo>) reclamoDao.findAll();
	}

	@Override
	public Reclamo buscarXID(Long id) {

		return reclamoDao.findById(id).orElse(null);
	}

	@Override
	public Reclamo guardarReclamo(Reclamo reclamo) {

		return reclamoDao.save(reclamo);
	}

}


