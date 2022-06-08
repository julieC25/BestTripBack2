package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Statistique;
import com.inti.repositories.StatistiqueRepository;
import com.inti.service.interfaces.IStatistiqueService;

@Service
public class StatistiqueService implements IStatistiqueService{
	@Autowired
	StatistiqueRepository statistiqueRepository;
	
	@Override
	public List<Statistique> findAll() {
		return statistiqueRepository.findAll();
	}

	@Override
	public Statistique findOne(Long id) {
		return statistiqueRepository.findById(id).get();
	}

	@Override
	public Statistique save(Statistique statistique) {
		return statistiqueRepository.save(statistique);
		
	}

	@Override
	public void delete(Long id) {
		statistiqueRepository.deleteById(id);
		
	}

}
