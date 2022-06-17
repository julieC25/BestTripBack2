package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.PointStatistique;

public interface IPointStatistiqueService {
	List<PointStatistique> findAll();

	PointStatistique findOne(Long id);

	PointStatistique save(PointStatistique pointStatistique);

	void delete(Long id);
}
