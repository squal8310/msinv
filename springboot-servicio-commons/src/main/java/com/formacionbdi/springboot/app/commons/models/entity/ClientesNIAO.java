package com.formacionbdi.springboot.app.commons.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "clientes_niao")
public class ClientesNIAO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7454461322405125032L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="nombre")
	private String nombre;
	@JoinColumn(name="c_id")
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
