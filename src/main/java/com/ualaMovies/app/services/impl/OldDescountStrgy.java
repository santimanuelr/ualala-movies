package com.ualaMovies.app.services.impl;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.ualaMovies.app.model.User;
import com.ualaMovies.app.services.PaymentDescountStrgyServ;

@Service
public class OldDescountStrgy implements PaymentDescountStrgyServ {

	@Override
	public BigDecimal getDescountByUserAndPayment(String paymenthType, BigDecimal totalToPay, User user) {
		/*Se puede mejorar esta comparacion*/
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -1);
		Date dateYearBefore = cal.getTime();
		if (user.getDateRegister().before(dateYearBefore)) {
			return totalToPay.multiply(new BigDecimal("0.97"));
		} else { 
			return totalToPay;			
		}
	}

}
