package com.formacionbdi.springboot.app.commons.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.formacionbdi.springboot.app.commons.models.entity.ContactoNIAO;

public class ClientesVONIAO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7454461322405125032L;

	private Integer id;
	private String nombre;
	private ContactoNIAO contacto;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ContactoNIAO getContacto() {
		return contacto;
	}
	public void setContacto(ContactoNIAO contacto) {
		this.contacto = contacto;
	}
	
}
