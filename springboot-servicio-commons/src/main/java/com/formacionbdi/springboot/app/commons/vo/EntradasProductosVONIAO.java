package com.formacionbdi.springboot.app.commons.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EntradasProductosVONIAO implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6097904587008735127L;
	@JsonProperty
	private List<ProductosVONIAO> productos;
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	private Date fechaTx;
	
	public List<ProductosVONIAO> getProductos() {
		return productos;
	}
	public void setProductos(List<ProductosVONIAO> productos) {
		this.productos = productos;
	}
	public Date getFechaTx() {
		return fechaTx;
	}
	public void setFechaTx(Date fechaTx) {
		this.fechaTx = fechaTx;
	}
}
