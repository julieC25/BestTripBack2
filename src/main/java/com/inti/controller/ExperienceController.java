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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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

	@PostMapping("/Experiences/rawdata")
	public Experience saveExperienceRaw(@RequestBody Experience experience) {
		if(experience.getIdExperience() == null) {
			Experience tmpexperience = new Experience();
			experience.setIdExperience(tmpexperience.getIdExperience());
		}
		else {
			byte[] file = ExperienceService.findOne(experience.getIdExperience()).getImage();
			experience.setImage(file);
		}
		return ExperienceService.save(experience);
	}
	
	@PostMapping("/experiences/file/{idexperience}")
	public String saveExperienceFile(@PathVariable("idexperience") Long id,@RequestParam("imagef") MultipartFile image) {
		try {
			Experience currenexperience = ExperienceService.findOne(id);
			currenexperience.setImage(image.getBytes());
			ExperienceService.save(currenexperience);
			return "File uploaded successfully! filename=" + image.getOriginalFilename();
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Fail! maybe you had uploaded the file before or the file's size > 500kb";
		}
	}
	
	@DeleteMapping("/Experience/removefile/{idE}")
	public void deleteFileFromExperience(@PathVariable("idE") Long idExperience) {
		Experience experience = ExperienceService.findOne(idExperience);
		experience.setImage(null);
		ExperienceService.save(experience);
	}

	@DeleteMapping("/Experiences/{idExperience}")
	public void delete(@PathVariable("idExperience") Long idExperience) {
		ExperienceService.delete(idExperience);
	}

	@PutMapping("/Experiences/{idE}")
	public Experience updateExperience(@PathVariable("idE") Long idExperience, @RequestBody Experience experience) {
		Experience currentExperience = ExperienceService.findOne(idExperience);
		currentExperience.setRecit(experience.getRecit());
		return ExperienceService.save(currentExperience);
	}
	
	@GetMapping("/Experiences/countByMonth")
	public int[] countByMonth() {
		return ExperienceService.countByMonth();
	}
	
}