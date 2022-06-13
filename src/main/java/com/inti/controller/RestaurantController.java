package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Restaurant;
import com.inti.service.interfaces.IRestaurantService;

@RestController
@CrossOrigin
public class RestaurantController {
	@Autowired
	IRestaurantService restaurantService;
	
	@GetMapping("/restaurants") 
	public List<Restaurant> findAll() {
		return restaurantService.findAll();
	}
	
	@GetMapping("/restaurants/{idLieu}") 
	public Restaurant findOne(@PathVariable("idLieu") Long id) {
		return restaurantService.findOne(id);
	}
	
	@PostMapping("/restaurants") 
	public Restaurant saveRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantService.save(restaurant);
	}
	@DeleteMapping("/restaurants/{idLieu}") 
	public void deleteRestaurant(@PathVariable("idLieu") Long id) {
		restaurantService.delete(id);
	}
}
