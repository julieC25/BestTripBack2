package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.CompagnieAerienne;
import com.inti.repositories.CompagnieAerienneRepository;
import com.inti.service.interfaces.ICompagnieAerienneService;

@Service
public class CompagnieAerienneService implements ICompagnieAerienneService {
	@Autowired
	CompagnieAerienneRepository compagnieAerienneRepository;

	@Override
	public List<CompagnieAerienne> findAll() {
		return compagnieAerienneRepository.findAll();
	}

	@Override
	public CompagnieAerienne findOne(Long id) {
		return compagnieAerienneRepository.findById(id).get();
	}

	@Override
	public CompagnieAerienne save(CompagnieAerienne compAerienne) {
		return compagnieAerienneRepository.save(compAerienne);
	}

	@Override
	public void delete(Long id) {
		compagnieAerienneRepository.deleteById(id);

	}

}
