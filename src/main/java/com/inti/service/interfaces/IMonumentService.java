package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Monument;

public interface IMonumentService {
	List<Monument> findAll();

	Monument findOne(Long idLieu);

	Monument save(Monument monument);

	void delete(Long idLieu);
}
