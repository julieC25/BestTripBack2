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

import com.inti.entities.Ville;
import com.inti.service.interfaces.IVilleService;

@RestController
@CrossOrigin
public class VilleController {
	@Autowired
	IVilleService villeService;
	
	@GetMapping("/villes") 
	public List<Ville> findAll() {
		return villeService.findAll();
	}
	
	@GetMapping("/villes/{idVille}") 
	public Ville findOne(@PathVariable("idVille") Long id) {
		return villeService.findOne(id);
	}
	
	@PostMapping("/villes") 
	public Ville saveVille(@RequestBody Ville ville) {
		return villeService.save(ville);
	}
	@DeleteMapping("/villes/{idVille}") 
	public void deleteVille(@PathVariable("idVille") Long id) {
		villeService.delete(id);
	}
}
