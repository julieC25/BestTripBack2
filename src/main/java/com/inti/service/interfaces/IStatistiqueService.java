package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Statistique;

public interface IStatistiqueService {
	List<Statistique> findAll();

	Statistique findOne(Long id);

	Statistique save(Statistique Statistique);

	void delete(Long id);
	
	Statistique generateStatistique(Statistique statistique, String[] valeursX, float[] valeursY);
}
