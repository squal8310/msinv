package com.formacionbdi.springboot.app.productos.models.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.app.commons.models.entity.CatalogsNIAO;
import com.formacionbdi.springboot.app.commons.models.entity.ProductosNIAO;
import com.formacionbdi.springboot.app.commons.models.entity.StockNIAO;
import com.formacionbdi.springboot.app.commons.vo.EntradasProductosVONIAO;
import com.formacionbdi.springboot.app.commons.vo.ProductosVONIAO;
import com.formacionbdi.springboot.app.productos.models.dao.ProductoDao;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private ProductoDao productoDao;
	@Autowired
	private ICatalogsService catServ;
	
	@Override
	@Transactional(readOnly = true)
	public List<EntradasProductosVONIAO> findAll() {
//		List<EntradasNIAO> entUn = (List<EntradasNIAO>) productoDao.findAll();
//		List<EntradasProductosVONIAO> entList = new ArrayList<>();
//		BeanUtils.copyProperties(entUn, entList);
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public EntradasProductosVONIAO findById(Long id) {
		return null;
	}

	@Override
	@Transactional()
	public EntradasProductosVONIAO save(EntradasProductosVONIAO producto) {
		
		List<ProductosNIAO> prodSv = producto.getProductos().stream().map(prod ->{
			Optional<CatalogsNIAO> cat0 = catServ.findById(prod.getCatalog());
			ProductosNIAO prodTg = new ProductosNIAO();
			StockNIAO stk = new StockNIAO();
			
			BeanUtils.copyProperties(prod, prodTg);
			BeanUtils.copyProperties(prod.getCatalog(), cat0);
			BeanUtils.copyProperties(prod.getStock(), stk);
			
			prodTg.setStock(stk);
			prodTg.setCatalog(cat0.get());
			return prodTg;
		}).collect(Collectors.toList());
		
		List<ProductosNIAO> prds = (List<ProductosNIAO>)productoDao.saveAll(prodSv);
		List<ProductosVONIAO> prdVo = prds.stream().map(pr-> {
			ProductosVONIAO prd = new ProductosVONIAO();
			BeanUtils.copyProperties(pr, prd);
			return prd;
		}).collect(Collectors.toList());
		EntradasProductosVONIAO ent = new EntradasProductosVONIAO();
		ent.setProductos(prdVo);
		return ent;
		 
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		productoDao.deleteById(id);
	}

}
