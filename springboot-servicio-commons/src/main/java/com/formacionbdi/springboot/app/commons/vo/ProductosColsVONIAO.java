package com.formacionbdi.springboot.app.commons.vo;

import java.io.Serializable;

import com.formacionbdi.springboot.app.commons.models.entity.ProductosNIAO;

public class ProductosColsVONIAO implements Serializable{

	private static final long serialVersionUID = 1285454306356845809L;
	private Long id;
	private Boolean active;
	private String name;
	private Integer orden;
	private String valor;
	private ProductosNIAO producto;
	
	public ProductosColsVONIAO() {
		// TODO Auto-generated constructor stub
	}
	public ProductosColsVONIAO(ProductosNIAO producto) {
		super();
		this.producto = producto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Integer getOrden() {
		return orden;
	}
	public void setOrden(Integer orden) {
		this.orden = orden;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public ProductosNIAO getProducto() {
		return producto;
	}
	public void setProducto(ProductosNIAO producto) {
		this.producto = producto;
	}
	
}
