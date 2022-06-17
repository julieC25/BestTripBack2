package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.CompagnieAerienne;

public interface ICompagnieAerienneService {
	List<CompagnieAerienne> findAll();

	CompagnieAerienne findOne(Long id);

	CompagnieAerienne save(CompagnieAerienne compAerienne);

	void delete(Long id);

}
