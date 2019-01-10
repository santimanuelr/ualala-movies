package com.ualaMovies.app.model;

import java.io.Serializable;
import java.util.List;

public class Series extends Product implements Serializable {

	public Series(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Season> seasons;

}
