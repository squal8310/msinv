package com.formacionbdi.springboot.app.productos.models.service;

import java.util.List;
import java.util.Optional;

import com.formacionbdi.springboot.app.commons.models.entity.CatalogsNIAO;
import com.formacionbdi.springboot.app.commons.vo.CatalogsVONIAO;

public interface ICatalogsService {

	public List<CatalogsNIAO> findAll();
	public Optional<CatalogsNIAO> findById(Long id);
	
	public CatalogsNIAO save(CatalogsVONIAO producto);
	
	public void deleteById(Long id);
}
