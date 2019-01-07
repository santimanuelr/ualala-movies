package com.ualaMovies.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.Calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ualaMovies.app.model.GoldUser;
import com.ualaMovies.app.services.PaymentServ;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UalaMoviesApplication.class)
public class UalaMoviesApplicationTests {
	
	@Autowired PaymentServ paymentServ;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void getTotalPaymentTest() {
		
		GoldUser goldUser = new GoldUser();
		Calendar c = Calendar.getInstance();
		c.set(2016, 5, 20, 0, 0);  
		goldUser.setDateRegister(c.getTime());
		
		BigDecimal totalPay = this.paymentServ.getTotalPaymentForUser("PAYPAL", goldUser);
		assertNotNull(totalPay);
		assertEquals("3.88", totalPay.toString());
	}

}

