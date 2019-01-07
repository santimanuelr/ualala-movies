package com.ualaMovies.app.model;

import java.io.Serializable;
import java.util.Date;

public class Award implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Date winnerDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getWinnerDate() {
		return winnerDate;
	}
	public void setWinnerDate(Date winnerDate) {
		this.winnerDate = winnerDate;
	}

}
