package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.CompagniesTransport;

public interface ICompagniesTransportService {
	List<CompagniesTransport> findAll();

	CompagniesTransport findOne(Long id);

	CompagniesTransport save(CompagniesTransport compTransport);

	void delete(Long id);

}
