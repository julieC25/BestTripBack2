package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Lieu;

public interface ILieuService {
	List<Lieu> findAll();

	Lieu findOne(Long idLieu);

	Lieu save(Lieu lieu);

	void delete(Long idLieu);
}
