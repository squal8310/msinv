package com.formacionbdi.springboot.app.commons.vo;

import java.io.Serializable;

import com.formacionbdi.springboot.app.commons.models.entity.ClientesNIAO;

public class ContactoVONIAO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8727175035127752143L;
	private Integer id;
	private String celular;
	private String correo;
	private String facebook;
	private String telCasa;
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
