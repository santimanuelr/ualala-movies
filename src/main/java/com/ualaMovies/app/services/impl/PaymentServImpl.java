package com.ualaMovies.app.services.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ualaMovies.app.model.Suscription;
import com.ualaMovies.app.model.User;
import com.ualaMovies.app.services.PaymentDescountStrgyServ;
import com.ualaMovies.app.services.PaymentServ;

@Service
public class PaymentServImpl implements PaymentServ {
	
	@Autowired private CreditCardDescountStrgy pereStrategy;
	@Autowired private OldDescountStrgy scoStrategy;

	@Override
	public BigDecimal getTotalPaymentForUser(String paymenthType, User user) {
		Optional<Suscription> suscription = Optional.of(user.getValidSuscription());
		BigDecimal totalToPay = new BigDecimal(0);
		
		List<PaymentDescountStrgyServ> paymentDescountStrgyServs = new ArrayList<PaymentDescountStrgyServ>();
		paymentDescountStrgyServs.add(pereStrategy);
		paymentDescountStrgyServs.add(scoStrategy);
		if (suscription.isPresent()) {
			totalToPay = suscription.get().getPrice();
			
			for (PaymentDescountStrgyServ paymentDescountStrgyServ : paymentDescountStrgyServs) {
				totalToPay = paymentDescountStrgyServ.getDescountByUserAndPayment(paymenthType, totalToPay, user);
			}			
		}
		return totalToPay;
	}

}
