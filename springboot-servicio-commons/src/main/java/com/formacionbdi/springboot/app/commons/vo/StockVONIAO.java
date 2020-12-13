package com.formacionbdi.springboot.app.commons.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formacionbdi.springboot.app.commons.models.entity.ProductosNIAO;

public class StockVONIAO implements Serializable{

	private static final long serialVersionUID = 1285454306356845809L;
	private Long id;
	
	private Integer cantidadEntrada;
	private Integer cantidadSalida;
	private BigDecimal precioEntrada;
	private BigDecimal precioSalida;
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	private Date fechaEntrada;
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	private Date fechaSalida;
	private Integer skuCodeBar;
	private ProductosNIAO producto;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getCantidadEntrada() {
		return cantidadEntrada;
	}
	public void setCantidadEntrada(Integer cantidadEntrada) {
		this.cantidadEntrada = cantidadEntrada;
	}
	public Integer getCantidadSalida() {
		return cantidadSalida;
	}
	public void setCantidadSalida(Integer cantidadSalida) {
		this.cantidadSalida = cantidadSalida;
	}
	public BigDecimal getPrecioEntrada() {
		return precioEntrada;
	}
	public void setPrecioEntrada(BigDecimal precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	public BigDecimal getPrecioSalida() {
		return precioSalida;
	}
	public void setPrecioSalida(BigDecimal precioSalida) {
		this.precioSalida = precioSalida;
	}
	public Date getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public Integer getSkuCodeBar() {
		return skuCodeBar;
	}
	public void setSkuCodeBar(Integer skuCodeBar) {
		this.skuCodeBar = skuCodeBar;
	}
	public ProductosNIAO getProducto() {
		return producto;
	}
	public void setProducto(ProductosNIAO producto) {
		this.producto = producto;
	}
}
