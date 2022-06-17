package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.PointStatistique;
import com.inti.repositories.PointStatistiqueRepository;
import com.inti.service.interfaces.IPointStatistiqueService;

@Service
public class PointStatistiqueService implements IPointStatistiqueService{
	@Autowired
	PointStatistiqueRepository pointStatistiqueRepository;
	
	@Override
	public List<PointStatistique> findAll() {
		return pointStatistiqueRepository.findAll();
	}

	@Override
	public PointStatistique findOne(Long id) {
		return pointStatistiqueRepository.findById(id).get();
	}

	@Override
	public PointStatistique save(PointStatistique pointStatistique) {
		return pointStatistiqueRepository.save(pointStatistique);
		
	}

	@Override
	public void delete(Long id) {
		pointStatistiqueRepository.deleteById(id);
		
	}

}
