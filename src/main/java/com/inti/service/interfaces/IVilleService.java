package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Ville;

public interface IVilleService {
	List<Ville> findAll();

	Ville findOne(Long idVille);

	Ville save(Ville ville);

	void delete(Long idVille);
}
