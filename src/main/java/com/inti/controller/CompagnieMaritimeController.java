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

import com.inti.entities.CompagnieMaritime;
import com.inti.service.interfaces.ICompagnieMaritimeService;

@RestController
public class CompagnieMaritimeController {
	@Autowired
	ICompagnieMaritimeService compagnieMaritimeService;

	@GetMapping("/compagnieMaritime")
	public List<CompagnieMaritime> findAll() {
		return compagnieMaritimeService.findAll();
	}

	@GetMapping("/compagnieMaritime/{idCompagnieMaritime}")
	public CompagnieMaritime findOne(@PathVariable("idCompagnieMaritime") Long id) {
		return compagnieMaritimeService.findOne(id);
	}

	@PostMapping("/compagnieMaritime")
	public CompagnieMaritime saveRole(@RequestBody CompagnieMaritime compMaritime) {
		return compagnieMaritimeService.save(compMaritime);
	}

	@DeleteMapping("/compagnieMaritime/{idCompagnieMaritime}")
	public void deleteRole(@PathVariable("idCompagnieMaritime") Long id) {
		compagnieMaritimeService.delete(id);
	}

	@PutMapping("/compagnieMaritime/{idCompagnieMaritime}")
	public CompagnieMaritime updateRoleWithPut(@PathVariable("idCompagnieMaritime") Long id,
			@RequestBody CompagnieMaritime compMaritime) {
		CompagnieMaritime currentCompMaritime = compagnieMaritimeService.findOne(id);
		currentCompMaritime.setNom(currentCompMaritime.getNom());
		return compagnieMaritimeService.save(currentCompMaritime);
	}

	@PatchMapping("/compagnieMaritime/{idCompagnieMaritime}")
	public CompagnieMaritime updateCompagnieMaritimeWithPatch(@PathVariable("idCompagnieMaritime") Long id,
			@RequestBody CompagnieMaritime compMaritime) {
		CompagnieMaritime currentCompMaritime = compagnieMaritimeService.findOne(id);
		currentCompMaritime.setNom(currentCompMaritime.getNom());
		return compagnieMaritimeService.save(currentCompMaritime);
	}
}
