package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Musee;
import com.inti.repositories.MuseeRepository;
import com.inti.service.interfaces.IMuseeService;

@Service
public class MuseeService implements IMuseeService {
	
	@Autowired
	MuseeRepository museeRepository;
	
	@Override
	public List<Musee> findAll() {
		return museeRepository.findAll();
	}

	@Override
	public Musee findOne(Long idLieu) {
		return museeRepository.findById(idLieu).get();
	}

	@Override
	public Musee save(Musee musee) {
		return museeRepository.save(musee);
	}

	@Override
	public void delete(Long idLieu) {
		museeRepository.deleteById(idLieu);
		
	}

}
