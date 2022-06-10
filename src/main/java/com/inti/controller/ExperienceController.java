package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Experience;
import com.inti.service.interfaces.IExperienceService;

@RestController 
@CrossOrigin
public class ExperienceController {
	@Autowired 
	IExperienceService ExperienceService;

	@GetMapping("/Experiences")
	public List<Experience> findAll() {
		return ExperienceService.findAll();
	}

	@GetMapping("/Experiences/{idE}") 
	public Experience findOne(@PathVariable("idE") Long idExperience) {
		return ExperienceService.findOne(idExperience); 
	}

	@PostMapping("/Experiences") 
	public Experience saveExperience(@RequestBody Experience Experience) {
		return ExperienceService.save(Experience);
	}

	@DeleteMapping("/Experiences/{idExperience}")
	public void deleteExperience(@PathVariable("idExperience") Long idExperience) {
		ExperienceService.delete(idExperience);
	}

	@PutMapping("/Experiences/{idE}")
	public Experience updateExperience(@PathVariable("idE") Long idExperience, @RequestBody Experience experience) {
		Experience currentExperience = ExperienceService.findOne(idExperience);
		currentExperience.setRecit(experience.getRecit());
		return ExperienceService.save(currentExperience);
	}
}