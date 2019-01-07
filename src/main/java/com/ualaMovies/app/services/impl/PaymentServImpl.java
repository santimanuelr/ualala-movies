package com.ualaMovies.app.services.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ualaMovies.app.model.User;
import com.ualaMovies.app.services.PaymentServ;

@Service
public class PaymentServImpl implements PaymentServ {
	
	@Autowired private CreditCardDescountStrgy pereStrategy;
	@Autowired private OldDescountStrgy scoStrategy;

	@Override
	public BigDecimal getTotalPaymentForUser(String paymenthType, User user) {
		BigDecimal totalToPay = new BigDecimal(0);
		totalToPay = user.getSuscriptionPay();
		/*Se puede mejorar esta comparacion*/
		if (user.getDateRegister().getYear() < 2018) {
			totalToPay = scoStrategy.getDescountByUserAndPayment(paymenthType, totalToPay);
		}
		if ("CREDIT_CARD".equals(paymenthType)) {
			totalToPay = pereStrategy.getDescountByUserAndPayment(paymenthType, totalToPay);
		}
		return totalToPay;
	}

}
