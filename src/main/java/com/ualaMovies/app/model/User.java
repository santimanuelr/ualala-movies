package com.ualaMovies.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User extends AuditableObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private StateOfMind status;
	private Integer countPeopleLogIn;
	private List<Product> whatUserSee;
	private List<Suscription> suscriptions = new ArrayList<Suscription>();
	

	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}


	public StateOfMind getStatus() {
		return status;
	}

	public void setStatus(StateOfMind status) {
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


	public List<Suscription> getSuscriptions() {
		return suscriptions;
	}



	public void setSuscriptions(List<Suscription> suscriptions) {
		this.suscriptions = suscriptions;
	}



	public Suscription getValidSuscription() {
		for(Suscription suscription : suscriptions){
			if (suscription.isValid())
				return suscription;
		}
		return null;
	}

}
