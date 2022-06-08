package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Lieu;
import com.inti.repositories.LieuRepository;
import com.inti.service.interfaces.ILieuService;

@Service
public class LieuService implements ILieuService {
	@Autowired
	LieuRepository lieuRepository;
	
	@Override
	public List<Lieu> findAll() {
		return lieuRepository.findAll();
	}

	@Override
	public Lieu findOne(Long idLieu) {
		return lieuRepository.findById(idLieu).get();
	}

	@Override
	public Lieu save(Lieu lieu) {
		return lieuRepository.save(lieu);
	}

	@Override
	public void delete(Long idLieu) {
		lieuRepository.deleteById(idLieu);
		
	}

}
