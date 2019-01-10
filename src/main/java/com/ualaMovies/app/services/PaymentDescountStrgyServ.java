package com.ualaMovies.app.services;

import java.math.BigDecimal;

import com.ualaMovies.app.model.User;

public interface PaymentDescountStrgyServ {
	
	public BigDecimal getDescountByUserAndPayment(String paymenthType, BigDecimal totalToPay, User user);

}
