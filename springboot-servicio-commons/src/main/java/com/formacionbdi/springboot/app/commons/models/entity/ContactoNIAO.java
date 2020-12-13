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
@Table(name = "contactos_niao")
public class ContactoNIAO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8727175035127752143L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="celular")
	private String celular;
	@Column(name="correo")
	private String correo;
	@Column(name="facebook")
	private String facebook;
	@Column(name="tel_casa")
	private String telCasa;
	@JoinColumn(name="cl_id")
	private ClientesNIAO cliente;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getTelCasa() {
		return telCasa;
	}
	public void setTelCasa(String telCasa) {
		this.telCasa = telCasa;
	}
	public ClientesNIAO getCliente() {
		return cliente;
	}
	public void setCliente(ClientesNIAO cliente) {
		this.cliente = cliente;
	}
	
}
