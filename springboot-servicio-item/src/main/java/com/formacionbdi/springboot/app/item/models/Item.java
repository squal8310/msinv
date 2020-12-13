package com.formacionbdi.springboot.app.item.models;

import com.formacionbdi.springboot.app.commons.models.entity.CatalogsNIAO;

public class Item {

	private CatalogsNIAO producto;
	private Integer cantidad;

	public Item() {
	}

	public Item(CatalogsNIAO producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public CatalogsNIAO getProducto() {
		return producto;
	}

	public void setProducto(CatalogsNIAO producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public Double getTotal() {
		return 0.0;
	}

}
