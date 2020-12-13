package com.formacionbdi.springboot.app.commons.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prods_cols_niao")
public class ProductosColsNIAO implements Serializable{

	private static final long serialVersionUID = 1285454306356845809L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="activo", insertable =true, updatable=true)
	private Boolean active;
	@Column(name="nombre", insertable =true, updatable=true)
	private String name;
	@Column(name="orden", insertable =true, updatable=true)
	private Integer orden;
	@Column(name="valor", insertable =true, updatable=true)
	private String valor;
	@ManyToOne(targetEntity = ProductosNIAO.class,fetch = FetchType.LAZY)
	@JoinColumn(name = "prod_id", insertable = true)
	private ProductosNIAO producto;
	
	public ProductosColsNIAO() {
		// TODO Auto-generated constructor stub
	}
	public ProductosColsNIAO(ProductosNIAO producto) {
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
