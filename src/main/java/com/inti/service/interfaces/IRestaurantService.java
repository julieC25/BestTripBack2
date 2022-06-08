package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Restaurant;

public interface IRestaurantService {
	List<Restaurant> findAll();

	Restaurant findOne(Long idLieu);

	Restaurant save(Restaurant restaurant);

	void delete(Long idLieu);
}
