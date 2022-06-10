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

import com.inti.entities.Musee;
import com.inti.service.interfaces.IMuseeService;

@RestController
@CrossOrigin
public class MuseeController {
	@Autowired
	IMuseeService museeService;
	
	@GetMapping("/musees") 
	public List<Musee> findAll() {
		return museeService.findAll();
	}
	
	@GetMapping("/musees/{idLieu}") 
	public Musee findOne(@PathVariable("idLieu") Long id) {
		return museeService.findOne(id);
	}
	
	@PostMapping("/musees") 
	public Musee saveMusee(@RequestBody Musee musee) {
		return museeService.save(musee);
	}
	@DeleteMapping("/musees/{idLieu}") 
	public void deleteMusee(@PathVariable("idLieu") Long id) {
		museeService.delete(id);
	}
}
