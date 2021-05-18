package com.chris.models.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;



@Entity
@Table(name = "producto")
public class Producto implements Serializable {

	private static final long serialVersionUID = -7167164081408841433L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_producto;
	
	@Column(name = "nombre_produco")
	private String nombre_produco;	
	
	
	@Column(name = "tecnologia")
	private String tecnologia;
	


	public Producto() {

	}


	public Long getCod_producto() {
		return cod_producto;
	}


	public void setCod_producto(Long cod_producto) {
		this.cod_producto = cod_producto;
	}


	public String getProduco() {
		return nombre_produco;
	}


	public void setProduco(String produco) {
		this.nombre_produco = produco;
	}


	public String getTecnologia() {
		return tecnologia;
	}


	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getNombre_produco() {
		return nombre_produco;
	}


	public void setNombre_produco(String nombre_produco) {
		this.nombre_produco = nombre_produco;
	}

	
	/*
	public List<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}*/



}
