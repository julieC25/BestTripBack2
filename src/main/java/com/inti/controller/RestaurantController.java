package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inti.entities.Guide;
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
	/*
	@PostMapping("/restaurants") 
	public Restaurant saveRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantService.save(restaurant);
	}*/
	@PostMapping("/restaurants/rawdata")
	public Restaurant saveGuideRaw(@RequestBody Restaurant restaurant) {
		if(restaurant.getIdLieu() == null) {
			Restaurant tmpRestaurant = new Restaurant();
			restaurant.setIdLieu(tmpRestaurant.getIdLieu());
		}
		else {
			byte[] file = restaurantService.findOne(restaurant.getIdLieu()).getCarte();
			restaurant.setCarte(file);
		}
		return restaurantService.save(restaurant);
	}
	@PostMapping("/restaurants/file/{id}")
	public String saveGuideFile(@PathVariable("id") Long id,@RequestParam("carte") MultipartFile carte) {
		try {
			Restaurant currentRestaurant = restaurantService.findOne(id);
			currentRestaurant.setCarte(carte.getBytes());
			restaurantService.save(currentRestaurant);
			return "File uploaded successfully! filename=" + carte.getOriginalFilename();
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Fail! maybe you had uploaded the file before or the file's size > 500kb";
		}
	}
	@DeleteMapping("/restaurants/{idLieu}") 
	public void deleteRestaurant(@PathVariable("idLieu") Long id) {
		restaurantService.delete(id);
	}
}
