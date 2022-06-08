package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.CompagnieFerroviere;

public interface ICompagnieFerroviereService {
	List<CompagnieFerroviere> findAll();

	CompagnieFerroviere findOne(Long id);

	CompagnieFerroviere save(CompagnieFerroviere compFerroviere);

	void delete(Long id);

}