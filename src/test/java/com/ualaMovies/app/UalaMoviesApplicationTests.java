package com.ualaMovies.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ualaMovies.app.model.Product;
import com.ualaMovies.app.model.StateOfMind;
import com.ualaMovies.app.model.Suscription;
import com.ualaMovies.app.model.User;
import com.ualaMovies.app.services.PaymentServ;
import com.ualaMovies.app.services.UserServ;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UalaMoviesApplication.class)
public class UalaMoviesApplicationTests {
	
	@Autowired PaymentServ paymentServ;
	@Autowired UserServ userServ;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void getTotalPaymentTest() {
		
		User goldUser = new User();
		Suscription goldSuscription = new Suscription();
		goldSuscription.setPrice(new BigDecimal("4"));
		goldSuscription.setValid(Boolean.TRUE);
		goldUser.getSuscriptions().add(goldSuscription);
		Calendar c = Calendar.getInstance();
		c.set(2016, 5, 20, 0, 0);  
		goldUser.setDateRegister(c.getTime());
		
		BigDecimal totalPay = this.paymentServ.getTotalPaymentForUser("PAYPAL", goldUser);
		assertNotNull(totalPay);
		assertEquals("3.88", totalPay.toString());
	}
	
	
	@Test
	public void getTotalPaymentPlatiniumCreditCardTest() {
		
		User user = new User();
		Suscription platiniumSuscription = new Suscription();
		platiniumSuscription.setName("Platinum");
		platiniumSuscription.setPrice(new BigDecimal("5"));
		platiniumSuscription.setValid(Boolean.TRUE);
		user.getSuscriptions().add(platiniumSuscription);
		Calendar c = Calendar.getInstance();
		c.set(2018, 8, 20, 0, 0);  
		user.setDateRegister(c.getTime());
		
		BigDecimal totalPay = this.paymentServ.getTotalPaymentForUser("CREDIT_CARD", user);
		assertNotNull(totalPay);
		assertEquals("4.90", totalPay.toString());
	}
	
	@Test
	public void getRecomendations() {
		
		User user = new User();
		Suscription platiniumSuscription = new Suscription();
		platiniumSuscription.setName("Platinum");
		platiniumSuscription.setPrice(new BigDecimal("5"));
		platiniumSuscription.setValid(Boolean.TRUE);
		user.getSuscriptions().add(platiniumSuscription);
		Calendar c = Calendar.getInstance();
		c.set(2018, 8, 20, 0, 0);  
		user.setDateRegister(c.getTime());
		user.setStatus(new StateOfMind("Triste"));
		
		
		List<Product> recomendation = this.userServ.getRecomendationByUser(user);
		assertNotNull(recomendation);
		assertEquals("Casablanca", recomendation.get(0).getName());
	}

}

