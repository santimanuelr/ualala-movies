package com.ualaMovies.app.services;

import java.math.BigDecimal;

public interface PaymentDescountStrgyServ {
	
	public BigDecimal getDescountByUserAndPayment(String paymenthType, BigDecimal totalToPay);

}
