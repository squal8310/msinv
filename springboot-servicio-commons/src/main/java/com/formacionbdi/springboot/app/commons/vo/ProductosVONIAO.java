package com.formacionbdi.springboot.app.commons.vo;

import java.io.Serializable;

public class ProductosVONIAO implements Serializable{

	private static final long serialVersionUID = 1285454306356845809L;
	private StockVONIAO stock;
	private Long catalog;
	
	public ProductosVONIAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getCatalog() {
		return catalog;
	}


	public void setCatalog(Long catalog) {
		this.catalog = catalog;
	}


	public StockVONIAO getStock() {
		return stock;
	}


	public void setStock(StockVONIAO stock) {
		this.stock = stock;
	}


}
