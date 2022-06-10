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

import com.inti.entities.Pays;
import com.inti.service.interfaces.IPaysService;

@RestController 
@CrossOrigin
public class PaysController {
	@Autowired 
	IPaysService paysService;

	@GetMapping("/payss")
	public List<Pays> findAll() {
		return paysService.findAll();
	}

	@GetMapping("/payss/{idP}") 
	public Pays findOne(@PathVariable("idP") Long idPays) {
		return paysService.findOne(idPays); 
	}

	@PostMapping("/payss") 
	public Pays savePays(@RequestBody Pays Pays) {
		return paysService.save(Pays);
	}

	@DeleteMapping("/payss/{idPays}")
	public void deletePays(@PathVariable("idPays") Long idPays) {
		paysService.delete(idPays);
	}

	@PutMapping("/payss/{idP}")
	public Pays updatePays(@PathVariable("idP") Long idPays, @RequestBody Pays pays) {
		Pays currentPays = paysService.findOne(idPays);
		currentPays.setNomPays(pays.getNomPays());
		return paysService.save(currentPays);
	}
}
