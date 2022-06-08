package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.CompagnieFerroviere;
import com.inti.repositories.CompagnieFerroviereRepository;
import com.inti.service.interfaces.ICompagnieFerroviereService;

@Service
public class CompagnieFerroviereService implements ICompagnieFerroviereService {
	@Autowired
	CompagnieFerroviereRepository compagnieFerroviereRepository;

	@Override
	public List<CompagnieFerroviere> findAll() {
		return compagnieFerroviereRepository.findAll();
	}

	@Override
	public CompagnieFerroviere findOne(Long id) {
		return compagnieFerroviereRepository.findById(id).get();
	}

	@Override
	public CompagnieFerroviere save(CompagnieFerroviere compFerroviere) {
		return compagnieFerroviereRepository.save(compFerroviere);
	}

	@Override
	public void delete(Long id) {
		compagnieFerroviereRepository.deleteById(id);

	}

}