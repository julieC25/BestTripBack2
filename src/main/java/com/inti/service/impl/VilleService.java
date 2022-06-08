package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Ville;
import com.inti.repositories.VilleRepository;
import com.inti.service.interfaces.IVilleService;

@Service
public class VilleService implements IVilleService {
	
	@Autowired
	VilleRepository villeRepository;
	
	@Override
	public List<Ville> findAll() {
		return villeRepository.findAll();
		
	}

	@Override
	public Ville findOne(Long idVille) {
		return villeRepository.findById(idVille).get();
	}

	@Override
	public Ville save(Ville ville) {
		return villeRepository.save(ville);
	}

	@Override
	public void delete(Long idVille) {
		villeRepository.deleteById(idVille);
		
	}

}
