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

import com.inti.entities.CompagnieFerroviere;
import com.inti.service.interfaces.ICompagnieFerroviereService;

@RestController
public class CompagnieFerroviereController {
	@Autowired
	ICompagnieFerroviereService compagnieFerroviereService;

	@GetMapping("/compagnieFerroviere")
	public List<CompagnieFerroviere> findAll() {
		return compagnieFerroviereService.findAll();
	}

	@GetMapping("/compagnieFerroviere/{idCompagnieFerroviere}")
	public CompagnieFerroviere findOne(@PathVariable("idCompagnieFerroviere") Long id) {
		return compagnieFerroviereService.findOne(id);
	}

	@PostMapping("/compagnieFerroviere")
	public CompagnieFerroviere saveRole(@RequestBody CompagnieFerroviere compFerroviere) {
		return compagnieFerroviereService.save(compFerroviere);
	}

	@DeleteMapping("/compagnieFerroviere/{idCompagnieFerroviere}")
	public void deleteRole(@PathVariable("idCompagnieFerroviere") Long id) {
		compagnieFerroviereService.delete(id);
	}

	@PutMapping("/compagnieFerroviere/{idCompagnieFerroviere}")
	public CompagnieFerroviere updateRoleWithPut(@PathVariable("idCompagnieFerroviere") Long id,
			@RequestBody CompagnieFerroviere compFerroviere) {
		CompagnieFerroviere currentCompFerroviere = compagnieFerroviereService.findOne(id);
		currentCompFerroviere.setNom(currentCompFerroviere.getNom());
		return compagnieFerroviereService.save(currentCompFerroviere);
	}

	@PatchMapping("/compagnieFerroviere/{idCompagnieFerroviere}")
	public CompagnieFerroviere updateCompagnieFerroviereWithPatch(@PathVariable("idCompagnieFerroviere") Long id,
			@RequestBody CompagnieFerroviere compFerroviere) {
		CompagnieFerroviere currentCompFerroviere = compagnieFerroviereService.findOne(id);
		currentCompFerroviere.setNom(currentCompFerroviere.getNom());
		return compagnieFerroviereService.save(currentCompFerroviere);
	}
}

