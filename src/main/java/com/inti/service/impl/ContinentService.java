package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Continent;
import com.inti.repositories.ContinentRepository;
import com.inti.service.interfaces.IContinentService;

@Service
public class ContinentService implements IContinentService{
	@Autowired
	ContinentRepository continentRepository;
	
	@Override
	public List<Continent> findAll() {
		return continentRepository.findAll();
	}

	@Override
	public Continent findOne(Long idContinent) {
		return continentRepository.findById(idContinent).get();
	}

	@Override
	public Continent save(Continent continent) {
		return continentRepository.save(continent);
	}

	@Override
	public void delete(Long idContinent) {
		continentRepository.deleteById(idContinent);
		
	}

}
