package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Continent;

public interface IContinentService {
	List<Continent> findAll();

	Continent findOne(Long idContinent);

	Continent save(Continent Continent);

	void delete(Long idContinent);


}
