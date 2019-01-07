package com.ualaMovies.app.services;

import java.math.BigDecimal;

import com.ualaMovies.app.model.User;

public interface PaymentServ {

	public BigDecimal getTotalPaymentForUser(String paymenthType, User user);
	
}
