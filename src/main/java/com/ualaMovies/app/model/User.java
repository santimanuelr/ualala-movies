package com.ualaMovies.app.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public abstract class User extends AuditableObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String status;
	private Integer countPeopleLogIn;
	private List<Product> whatUserSee;
	
	public abstract BigDecimal getSuscriptionPay();
	

	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCountPeopleLogIn() {
		return countPeopleLogIn;
	}

	public void setCountPeopleLogIn(Integer countPeopleLogIn) {
		this.countPeopleLogIn = countPeopleLogIn;
	}

	public List<Product> getWhatUserSee() {
		return whatUserSee;
	}

	public void setWhatUserSee(List<Product> whatUserSee) {
		this.whatUserSee = whatUserSee;
	}

}
