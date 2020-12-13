package com.formacionbdi.springboot.app.commons.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "catalogos_niao")
public class CatalogsNIAO implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String name;
	@Column(name="descripcion")
	private String desc;
	@Column(name="id_ref_root")
	private Integer idrefRoot;
	@Column(name="id_ref")
	private Integer idRef;
	
	private static final long serialVersionUID = 1285454306356845809L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIdrefRoot() {
		return idrefRoot;
	}

	public void setIdrefRoot(Integer idrefRoot) {
		this.idrefRoot = idrefRoot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getIdRef() {
		return idRef;
	}

	public void setIdRef(Integer idRef) {
		this.idRef = idRef;
	}

}
