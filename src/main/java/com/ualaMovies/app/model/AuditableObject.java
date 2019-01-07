package com.ualaMovies.app.model;

import java.io.Serializable;
import java.util.Date;

public class AuditableObject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Long id;
	private String userRegister;
	private Date dateRegister;
	private String userModifier;
	private Date dateModifier;
	private Long version;
	
	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUserRegister() {
		return userRegister;
	}
	public void setUserRegister(String userRegister) {
		this.userRegister = userRegister;
	}
	
	public Date getDateRegister() {
		return dateRegister;
	}
	public void setDateRegister(Date dateRegister) {
		this.dateRegister = dateRegister;
	}
	
	public String getUserModifier() {
		return userModifier;
	}
	public void setUserModifier(String userModifier) {
		this.userModifier = userModifier;
	}

	public Date getDateModifier() {
		return dateModifier;
	}
	public void setDateModifier(Date dateModifier) {
		this.dateModifier = dateModifier;
	}
	
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}

}
