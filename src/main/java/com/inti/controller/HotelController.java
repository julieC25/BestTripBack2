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

import com.inti.entities.Hotel;
import com.inti.service.interfaces.IHotelService;

@RestController
@CrossOrigin
public class HotelController {
	@Autowired
	IHotelService hotelService;
	
	@GetMapping("/hotels") 
	public List<Hotel> findAll() {
		return hotelService.findAll();
	}
	
	@GetMapping("/hotels/{idLieu}") 
	public Hotel findOne(@PathVariable("idLieu") Long id) {
		return hotelService.findOne(id);
	}
	
	@PostMapping("/hotels") 
	public Hotel saveHotel(@RequestBody Hotel hotel) {
		return hotelService.save(hotel);
	}
	@DeleteMapping("/hotels/{idLieu}") 
	public void deleteHotel(@PathVariable("idLieu") Long id) {
		hotelService.delete(id);
	}
}
