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

import com.inti.entities.Statistique;
import com.inti.service.interfaces.IPointStatistiqueService;
import com.inti.service.interfaces.IStatistiqueService;

@RestController
@CrossOrigin
public class StatistiqueController {
	@Autowired
	IStatistiqueService statistiqueService;
	@Autowired
	IPointStatistiqueService pointStatistiqueService;
	
	@GetMapping("/statistiques")
	public List<Statistique> findAll(){
		return statistiqueService.findAll();
	}
	
	@PostMapping("/generatePointsStatistique")
	public Statistique generatePointsStatistique(@RequestBody Statistique statistique,
			@RequestBody String[] valeursX, @RequestBody float[] valeursY) {
		return statistiqueService.generateStatistique(statistique, valeursX, valeursY);
	}
	
	@GetMapping("/statistiques/{idStatistique}")
	public Statistique findOne(@PathVariable("idStatistique") Long id) {
		return statistiqueService.findOne(id);
	}
	
	@PostMapping("/statistiques")
	public Statistique saveStatistique(@RequestBody Statistique statistique) {
		return statistiqueService.save(statistique);
	}
	
	@DeleteMapping("/statistiques/{idStatistique}")
	public void delete(@PathVariable("idStatistique") Long id) {
		statistiqueService.delete(id);
	}
}