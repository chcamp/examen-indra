package com.chris.models.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "reclamo")
public class Reclamo implements Serializable {

	private static final long serialVersionUID = -7167164081408841433L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_reclamo;

	@Column(name = "motivo_reclamo")
	private String motivo_reclamo;

	@Column(name = "descripcion_reclamo")
	private String descripcion_reclamo;

	public Reclamo() {

	}

	public Long getCod_reclamo() {
		return cod_reclamo;
	}

	public void setCod_reclamo(Long cod_reclamo) {
		this.cod_reclamo = cod_reclamo;
	}

	public String getMotivo_reclamo() {
		return motivo_reclamo;
	}

	public void setMotivo_reclamo(String motivo_reclamo) {
		this.motivo_reclamo = motivo_reclamo;
	}

	public String getDescripcion_reclamo() {
		return descripcion_reclamo;
	}

	public void setDescripcion_reclamo(String descripcion_reclamo) {
		this.descripcion_reclamo = descripcion_reclamo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Reclamo [cod_reclamo=" + cod_reclamo + ", motivo_reclamo=" + motivo_reclamo + ", descripcion_reclamo="
				+ descripcion_reclamo + "]";
	}

}
