package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.LocationVoitures;
import com.inti.service.interfaces.ILocationVoituresService;

@RestController
public class LocationVoituresController {
	@Autowired
	ILocationVoituresService locationVoituresService;

	@GetMapping("/locationVoitures")
	public List<LocationVoitures> findAll() {
		return locationVoituresService.findAll();
	}

	@GetMapping("/locationVoitures/{idLocationVoitures}")
	public LocationVoitures findOne(@PathVariable("idLocationVoitures") Long id) {
		return locationVoituresService.findOne(id);
	}

	@PostMapping("/locationVoitures")
	public LocationVoitures saveRole(@RequestBody LocationVoitures locVoitures) {
		return locationVoituresService.save(locVoitures);
	}

	@DeleteMapping("/locationVoitures/{idLocationVoitures}")
	public void deleteRole(@PathVariable("idLocationVoitures") Long id) {
		locationVoituresService.delete(id);
	}

	@PutMapping("/locationVoitures/{idLocationVoitures}")
	public LocationVoitures updateRoleWithPut(@PathVariable("idLocationVoitures") Long id,
			@RequestBody LocationVoitures locVoitures) {
		LocationVoitures currentLocVoiture = locationVoituresService.findOne(id);
		currentLocVoiture.setModelVoiture(locVoitures.getModelVoiture());
		return locationVoituresService.save(currentLocVoiture);
	}

	@PatchMapping("/locationVoitures/{idLocationVoitures}")
	public LocationVoitures updateLocationVoituresWithPatch(@PathVariable("idLocationVoitures") Long id,
			@RequestBody LocationVoitures locVoitures) {
		LocationVoitures currentLocVoiture = locationVoituresService.findOne(id);
		currentLocVoiture.setModelVoiture(locVoitures.getModelVoiture());
		return locationVoituresService.save(currentLocVoiture);
	}
}