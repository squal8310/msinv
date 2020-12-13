package com.formacionbdi.springboot.app.productos.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.app.commons.models.entity.CatalogsNIAO;
import com.formacionbdi.springboot.app.commons.vo.CatalogsVONIAO;
import com.formacionbdi.springboot.app.productos.models.dao.CatalogsDao;

@Service
public class CatalogsServiceImpl implements ICatalogsService{

	@Autowired
	private CatalogsDao catDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<CatalogsNIAO> findAll() {
		return (List<CatalogsNIAO>) catDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<CatalogsNIAO> findById(Long id) {
		return catDao.findById(id);
	}

	@Override
	@Transactional()
	public CatalogsNIAO save(CatalogsVONIAO cat) {
		CatalogsNIAO catO = new CatalogsNIAO();
		BeanUtils.copyProperties(cat, catO);
		return catDao.save(catO);
		 
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		catDao.deleteById(id);
	}

}
