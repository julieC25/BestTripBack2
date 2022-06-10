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

import com.inti.entities.Lieu;
import com.inti.service.interfaces.ILieuService;

@RestController
@CrossOrigin
public class LieuController {
	@Autowired
	ILieuService lieuService;
	
	@GetMapping("/lieux") 
	public List<Lieu> findAll() {
		return lieuService.findAll();
	}
	
	@GetMapping("/lieux/{idLieu}") 
	public Lieu findOne(@PathVariable("idLieu") Long id) {
		return lieuService.findOne(id);
	}
	
	@PostMapping("/lieux") 
	public Lieu saveLieu(@RequestBody Lieu lieu) {
		return lieuService.save(lieu);
	}
	@DeleteMapping("/lieux/{idLieu}") 
	public void deleteLieu(@PathVariable("idLieu") Long id) {
		lieuService.delete(id);
	}
}
