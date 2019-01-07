package com.ualaMovies.app.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PlatinumUser extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public BigDecimal getSuscriptionPay() {
		return new BigDecimal("5");
	}

}
