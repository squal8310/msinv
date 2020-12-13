package com.formacionbdi.springboot.app.item.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.item.models.Item;
import com.formacionbdi.springboot.app.commons.models.entity.CatalogsNIAO;

public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
	
	public CatalogsNIAO save(CatalogsNIAO producto);
	
	public CatalogsNIAO update(CatalogsNIAO producto, Long id);
	
	public void delete(Long id);
}
