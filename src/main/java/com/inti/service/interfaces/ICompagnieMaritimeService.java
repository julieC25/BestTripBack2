package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.CompagnieMaritime;

public interface ICompagnieMaritimeService {
	List<CompagnieMaritime> findAll();

	CompagnieMaritime findOne(Long id);

	CompagnieMaritime save(CompagnieMaritime compMaritime);

	void delete(Long id);

}
