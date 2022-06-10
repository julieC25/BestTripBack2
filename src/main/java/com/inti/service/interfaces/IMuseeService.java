package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Musee;

public interface IMuseeService {
	List<Musee> findAll();

	Musee findOne(Long idLieu);

	Musee save(Musee musee);

	void delete(Long idLieu);
}
