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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Guide;
import com.inti.service.interfaces.IGuideService;

@RestController 
@CrossOrigin
public class GuideController {
	@Autowired 
	IGuideService guideService;

	@GetMapping("guides")
	public List<Guide> findAll() {
		return guideService.findAll();
	}

	@GetMapping("guides/{idG}") 
	public Guide findOne(@PathVariable("idG") Long idGuide) {
		return guideService.findOne(idGuide); 
	}

	@PostMapping("guides") 
	public Guide saveguide(@RequestBody Guide guide) {
		return guideService.save(guide);
	}

	@DeleteMapping("guides/{idGuide}")
	public void deleteguide(@PathVariable("idGuide") Long idGuide) {
		guideService.delete(idGuide);
	}

	@PutMapping("guides/{idG}")
	public Guide updateguide(@PathVariable("idG") Long idGuide, @RequestBody Guide guide) {
		Guide currentGuide = guideService.findOne(idGuide);
		currentGuide.setTitre(guide.getTitre());
		return guideService.save(currentGuide);
	}
}
