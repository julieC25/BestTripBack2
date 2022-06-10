package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.LocationVoitures;

public interface ILocationVoituresService {
	List<LocationVoitures> findAll();

	LocationVoitures findOne(Long id);

	LocationVoitures save(LocationVoitures locVoitures);

	void delete(Long id);

}
