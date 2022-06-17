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

import com.inti.entities.Continent;
import com.inti.service.interfaces.IContinentService;

@RestController 
@CrossOrigin
public class ContinentController {
	@Autowired 
	IContinentService continentService;

	@GetMapping("/continents")
	public List<Continent> findAll() {
		return continentService.findAll();
	}

	@GetMapping("/continents/{idC}") 
	public Continent findOne(@PathVariable("idC") Long idContinent) {
		return continentService.findOne(idContinent); 
	}

	@PostMapping("/continents") 
	public Continent saveContinent(@RequestBody Continent continent) {
		return continentService.save(continent);
	}

	@DeleteMapping("/continents/{idContinent}")
	public void deleteContinent(@PathVariable("idContinent") Long idContinent) {
		continentService.delete(idContinent);
	}

}
