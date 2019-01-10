package com.ualaMovies.app.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ualaMovies.app.model.Movie;
import com.ualaMovies.app.model.Product;
import com.ualaMovies.app.model.User;
import com.ualaMovies.app.services.UserServ;

@Service
public class UserServImpl implements UserServ {

	@Override
	public List<Product> getRecomendationByUser(User user) {
		//Si está triste le interesan las películas que duran más de 2hs.
		/*IR A LA BD*/
		List<Product> products = new ArrayList<Product>();
		if ("Triste".equals(user.getStatus().getStatus())) {
			products.add(new Movie("Casablanca"));
			return products;
		}
		return products;
	}

}
