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

import com.inti.entities.CompagniesTransport;
import com.inti.service.interfaces.ICompagniesTransportService;

@RestController
public class CompagniesTransportController {
	@Autowired
	ICompagniesTransportService compagniesTransportService;

	@GetMapping("/compagniesTransport")
	public List<CompagniesTransport> findAll() {
		return compagniesTransportService.findAll();
	}

	@GetMapping("/compagniesTransport/{idCompagniesTransport}")
	public CompagniesTransport findOne(@PathVariable("idCompagniesTransport") Long id) {
		return compagniesTransportService.findOne(id);
	}

	@PostMapping("/compagniesTransport")
	public CompagniesTransport saveRole(@RequestBody CompagniesTransport compTransport) {
		return compagniesTransportService.save(compTransport);
	}

	@DeleteMapping("/compagniesTransport/{idCompagniesTransport}")
	public void deleteRole(@PathVariable("idCompagniesTransport") Long id) {
		compagniesTransportService.delete(id);
	}

	@PutMapping("/compagniesTransport/{idCompagniesTransport}")
	public CompagniesTransport updateRoleWithPut(@PathVariable("idCompagniesTransport") Long id,
			@RequestBody CompagniesTransport compTransport) {
		CompagniesTransport currentCompTransport = compagniesTransportService.findOne(id);
		currentCompTransport.setNom(currentCompTransport.getNom());
		return compagniesTransportService.save(currentCompTransport);
	}

	@PatchMapping("/compagniesTransport/{idCompagniesTransport}")
	public CompagniesTransport updateCompagniesTransportWithPatch(@PathVariable("idCompagniesTransport") Long id,
			@RequestBody CompagniesTransport compTransport) {
		CompagniesTransport currentCompTransport = compagniesTransportService.findOne(id);
		currentCompTransport.setNom(currentCompTransport.getNom());
		return compagniesTransportService.save(currentCompTransport);
	}
}