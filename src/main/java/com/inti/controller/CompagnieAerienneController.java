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

import com.inti.entities.CompagnieAerienne;
import com.inti.service.interfaces.ICompagnieAerienneService;

@RestController
public class CompagnieAerienneController {
	@Autowired
	ICompagnieAerienneService compagnieAerienneService;

	@GetMapping("/compagnieAerienne")
	public List<CompagnieAerienne> findAll() {
		return compagnieAerienneService.findAll();
	}

	@GetMapping("/compagnieAerienne/{idCompagnieAerienne}")
	public CompagnieAerienne findOne(@PathVariable("idCompagnieAerienne") Long id) {
		return compagnieAerienneService.findOne(id);
	}

	@PostMapping("/compagnieAerienne")
	public CompagnieAerienne saveRole(@RequestBody CompagnieAerienne locVoitures) {
		return compagnieAerienneService.save(locVoitures);
	}

	@DeleteMapping("/compagnieAerienne/{idCompagnieAerienne}")
	public void deleteRole(@PathVariable("idCompagnieAerienne") Long id) {
		compagnieAerienneService.delete(id);
	}

	@PutMapping("/compagnieAerienne/{idCompagnieAerienne}")
	public CompagnieAerienne updateRoleWithPut(@PathVariable("idCompagnieAerienne") Long id,
			@RequestBody CompagnieAerienne compAerienne) {
		CompagnieAerienne currentCompAerienne = compagnieAerienneService.findOne(id);
		currentCompAerienne.setNom(currentCompAerienne.getNom());
		return compagnieAerienneService.save(currentCompAerienne);
	}

	@PatchMapping("/compagnieAerienne/{idCompagnieAerienne}")
	public CompagnieAerienne updateCompagnieAerienneWithPatch(@PathVariable("idCompagnieAerienne") Long id,
			@RequestBody CompagnieAerienne compAerienne) {
		CompagnieAerienne currentCompAerienne = compagnieAerienneService.findOne(id);
		currentCompAerienne.setNom(currentCompAerienne.getNom());
		return compagnieAerienneService.save(currentCompAerienne);
	}
}

