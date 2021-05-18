package com.chris.models.entidad;

import java.io.Serializable;	


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




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


	@Override
	public String toString() {
		return "Producto [cod_producto=" + cod_producto + ", produco=" + nombre_produco + ", tecnologia=" + tecnologia + "]";
	}
	


}
