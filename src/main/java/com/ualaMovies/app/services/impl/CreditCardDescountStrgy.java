package com.ualaMovies.app.services.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.ualaMovies.app.services.PaymentDescountStrgyServ;

@Service
public class CreditCardDescountStrgy implements PaymentDescountStrgyServ {

	@Override
	public BigDecimal getDescountByUserAndPayment(String paymenthType, BigDecimal totalToPay) {
		return totalToPay.multiply(new BigDecimal("0.98"));
	}

}
