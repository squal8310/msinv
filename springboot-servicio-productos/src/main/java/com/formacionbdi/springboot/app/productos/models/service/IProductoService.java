package com.formacionbdi.springboot.app.productos.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.commons.vo.EntradasProductosVONIAO;

public interface IProductoService {

	public List<EntradasProductosVONIAO> findAll();
	public EntradasProductosVONIAO findById(Long id);
	
	public EntradasProductosVONIAO save(EntradasProductosVONIAO producto);
	
	public void deleteById(Long id);
}
