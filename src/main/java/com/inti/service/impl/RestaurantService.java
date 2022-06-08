package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Restaurant;
import com.inti.repositories.RestaurantRepository;
import com.inti.service.interfaces.IRestaurantService;

@Service
public class RestaurantService implements IRestaurantService {
	
	@Autowired
	RestaurantRepository restaurantRepository;
	
	@Override
	public List<Restaurant> findAll() {
		return restaurantRepository.findAll();
	}

	@Override
	public Restaurant findOne(Long idLieu) {
		return restaurantRepository.findById(idLieu).get();
	}

	@Override
	public Restaurant save(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	@Override
	public void delete(Long idLieu) {
		restaurantRepository.deleteById(idLieu);
		
	}

}
