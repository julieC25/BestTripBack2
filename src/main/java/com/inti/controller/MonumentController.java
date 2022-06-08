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

import com.inti.entities.Monument;
import com.inti.service.interfaces.IMonumentService;

@RestController
@CrossOrigin
public class MonumentController {
	@Autowired
	IMonumentService monumentService;
	
	@GetMapping("/monuments") 
	public List<Monument> findAll() {
		return monumentService.findAll();
	}
	
	@GetMapping("/monuments/{idLieu}") 
	public Monument findOne(@PathVariable("idLieu") Long id) {
		return monumentService.findOne(id);
	}
	
	@PostMapping("/monuments") 
	public Monument saveMonument(@RequestBody Monument monument) {
		return monumentService.save(monument);
	}
	@DeleteMapping("/monuments/{idLieu}") 
	public void deleteMonument(@PathVariable("idLieu") Long id) {
		monumentService.delete(id);
	}
}
