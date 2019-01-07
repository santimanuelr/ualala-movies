package com.ualaMovies.app.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ClassicUser extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public BigDecimal getSuscriptionPay() {
		return new BigDecimal("2");
	}

}
