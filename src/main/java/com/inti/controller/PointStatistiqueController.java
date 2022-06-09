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

import com.inti.entities.PointStatistique;
import com.inti.service.interfaces.IPointStatistiqueService;

@RestController
@CrossOrigin
public class PointStatistiqueController {
	@Autowired
	IPointStatistiqueService pointStatistiqueService;
	
	@GetMapping("/pointStatistiques")
	public List<PointStatistique> findAll(){
		return pointStatistiqueService.findAll();
	}
	
	@GetMapping("/pointStatistiques/{idPointStatistique}")
	public PointStatistique findOne(@PathVariable("idPointStatistique") Long id) {
		return pointStatistiqueService.findOne(id);
	}
	
	@PostMapping("/pointStatistiques")
	public PointStatistique savePointStatistique(@RequestBody PointStatistique pointStatistique) {
		return pointStatistiqueService.save(pointStatistique);
	}
	
	@DeleteMapping("/pointStatistiques/{idPointStatistique}")
	public void delete(@PathVariable("idPointStatistique") Long id) {
		pointStatistiqueService.delete(id);
	}
}