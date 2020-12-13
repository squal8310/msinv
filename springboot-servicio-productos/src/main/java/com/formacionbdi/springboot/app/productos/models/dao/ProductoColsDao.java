package com.formacionbdi.springboot.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.springboot.app.commons.models.entity.ProductosColsNIAO;

public interface ProductoColsDao extends CrudRepository<ProductosColsNIAO, Long>{

}
