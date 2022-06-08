package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.LocationVoitures;
import com.inti.repositories.LocationVoituresRepository;
import com.inti.service.interfaces.ILocationVoituresService;

@Service
public class LocationVoituresService implements ILocationVoituresService {
	@Autowired
	LocationVoituresRepository locationVoituresRepository;

	@Override
	public List<LocationVoitures> findAll() {
		return locationVoituresRepository.findAll();
	}

	@Override
	public LocationVoitures findOne(Long id) {
		return locationVoituresRepository.findById(id).get();
	}

	@Override
	public LocationVoitures save(LocationVoitures locVoitures) {
		return locationVoituresRepository.save(locVoitures);
	}

	@Override
	public void delete(Long id) {
		locationVoituresRepository.deleteById(id);

	}

}