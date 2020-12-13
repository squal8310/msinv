package com.formacionbdi.springboot.app.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.commons.vo.EntradasProductosVONIAO;
import com.formacionbdi.springboot.app.productos.models.service.IProductoService;

@RestController
public class ProductoController {
	
	//@Autowired
	//private Environment env;
	
	@Value("${server.port}")
	private Integer port;
	
	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/tst")
	public String tst(){
		return "hi hello";
	}
	
	@GetMapping("/listar")
	public List<EntradasProductosVONIAO> listar(){
		return null;
	}
	
	@GetMapping("/ver/{id}")
	public EntradasProductosVONIAO detalle(@PathVariable Long id) {
//		EntradasProductosNIAO producto = productoService.findById(id);
		//producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		
		/*
		 * try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		return null;
	}
	
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public EntradasProductosVONIAO crear(@RequestBody EntradasProductosVONIAO producto) {
		return productoService.save(producto);
		
	}
	
	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public EntradasProductosVONIAO editar(@RequestBody EntradasProductosVONIAO producto, @PathVariable Long id) {
		EntradasProductosVONIAO productoDb = productoService.findById(id);
		
//		productoDb.setNombre(producto.getNombre());
//        productoDb.setPrecio(producto.getPrecio());
        
        return productoService.save(productoDb);
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		productoService.deleteById(id);
	}
	

}
