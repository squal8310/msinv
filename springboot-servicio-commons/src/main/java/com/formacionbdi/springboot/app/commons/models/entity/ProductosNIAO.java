package com.formacionbdi.springboot.app.commons.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos_niao")
public class ProductosNIAO implements Serializable{

	private static final long serialVersionUID = 1285454306356845809L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="stock_id")
	private StockNIAO stock;
	
	@OneToOne
	@JoinColumn(name="cat_id")
	private CatalogsNIAO catalog;
	
	public ProductosNIAO() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public StockNIAO getStock() {
		return stock;
	}

	public void setStock(StockNIAO stock) {
		this.stock = stock;
	}

	public CatalogsNIAO getCatalog() {
		return catalog;
	}

	public void setCatalog(CatalogsNIAO catalog) {
		this.catalog = catalog;
	}
}
