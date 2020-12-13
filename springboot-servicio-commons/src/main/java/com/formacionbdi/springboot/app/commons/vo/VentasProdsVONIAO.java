package com.formacionbdi.springboot.app.commons.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.formacionbdi.springboot.app.commons.models.entity.ProductosNIAO;

public class VentasProdsVONIAO implements Serializable{

	private Long id;
	
	private List<ProductosNIAO> productos;
	private Date fechaTx;
	
	
	private static final long serialVersionUID = 1285454306356845809L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ProductosNIAO> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductosNIAO> productos) {
		this.productos = productos;
	}

	public Date getFechaTx() {
		return fechaTx;
	}

	public void setFechaTx(Date fechaTx) {
		this.fechaTx = fechaTx;
	}

}
