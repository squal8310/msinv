package com.formacionbdi.springboot.app.commons.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_niao")
public class StockNIAO implements Serializable{

	private static final long serialVersionUID = 1285454306356845809L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="cantidad_entrada")
	private Integer cantidadEntrada;
	@Column(name="cantidad_salida")
	private Integer cantidadSalida;
	@Column(name="precio_entrada")
	private BigDecimal precioEntrada;
	@Column(name="precio_salida")
	private BigDecimal precioSalida;
	@Column(name="fecha_entrada")
	private Date fechaEntrada;
	@Column(name="fecha_salida")
	private Date fechaSalida;
	@Column(name="sku_code_bar")
	private Integer skuCodeBar;
	
	
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
}
