package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Monument;
import com.inti.repositories.MonumentRepository;
import com.inti.service.interfaces.IMonumentService;

@Service
public class MonumentService implements IMonumentService {
	
	@Autowired
	MonumentRepository monumentRepository;
	
	@Override
	public List<Monument> findAll() {
		return monumentRepository.findAll();
	}

	@Override
	public Monument findOne(Long idLieu) {
		return monumentRepository.findById(idLieu).get();
	}

	@Override
	public Monument save(Monument monument) {
		return monumentRepository.save(monument);
	}

	@Override
	public void delete(Long idLieu) {
		monumentRepository.deleteById(idLieu);
		
	}

}
