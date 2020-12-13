package com.formacionbdi.springboot.app.commons.vo;

import java.io.Serializable;

public class CatalogsVONIAO implements Serializable{

	private Integer id;
	private String name;
	private String desc;
	private Integer idrefRoot;
	private Integer idRef;
	
	private static final long serialVersionUID = 1285454306356845809L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
