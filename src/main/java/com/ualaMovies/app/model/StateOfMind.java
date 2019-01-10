package com.ualaMovies.app.model;

import java.io.Serializable;

public class StateOfMind extends AuditableObject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String status;
	
	
	public StateOfMind(String status) {
		super();
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
