package com.ualaMovies.app.services;

import java.util.List;

import com.ualaMovies.app.model.Product;
import com.ualaMovies.app.model.User;

public interface UserServ {
	
	public List<Product> getRecomendationByUser(User user); 

}
