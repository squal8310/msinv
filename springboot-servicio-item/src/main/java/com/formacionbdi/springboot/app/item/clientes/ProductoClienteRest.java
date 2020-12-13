package com.formacionbdi.springboot.app.item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.formacionbdi.springboot.app.commons.models.entity.CatalogsNIAO;

@FeignClient(name = "servicio-productos")
public interface ProductoClienteRest {
	
	@GetMapping("/listar")
	public List<CatalogsNIAO> listar();
	
	@GetMapping("/ver/{id}")
	public CatalogsNIAO detalle(@PathVariable Long id);
	
	@PostMapping("/crear")
	public CatalogsNIAO crear(@RequestBody CatalogsNIAO producto);
	
	@PutMapping("/editar/{id}")
	public CatalogsNIAO update(@RequestBody CatalogsNIAO producto, @PathVariable Long id);
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id);

}
