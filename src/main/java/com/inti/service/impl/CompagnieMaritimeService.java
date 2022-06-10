package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.CompagnieMaritime;
import com.inti.repositories.CompagnieMaritimeRepository;
import com.inti.service.interfaces.ICompagnieMaritimeService;

@Service
public class CompagnieMaritimeService implements ICompagnieMaritimeService {
	@Autowired
	CompagnieMaritimeRepository compagnieMaritimeRepository;

	@Override
	public List<CompagnieMaritime> findAll() {
		return compagnieMaritimeRepository.findAll();
	}

	@Override
	public CompagnieMaritime findOne(Long id) {
		return compagnieMaritimeRepository.findById(id).get();
	}

	@Override
	public CompagnieMaritime save(CompagnieMaritime compMaritime) {
		return compagnieMaritimeRepository.save(compMaritime);
	}

	@Override
	public void delete(Long id) {
		compagnieMaritimeRepository.deleteById(id);

	}

}