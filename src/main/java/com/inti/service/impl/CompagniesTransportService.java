package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.CompagniesTransport;
import com.inti.repositories.CompagniesTransportRepository;
import com.inti.service.interfaces.ICompagniesTransportService;

@Service
public class CompagniesTransportService implements ICompagniesTransportService {
	@Autowired
	CompagniesTransportRepository compagniesTransportRepository;

	@Override
	public List<CompagniesTransport> findAll() {
		return compagniesTransportRepository.findAll();
	}

	@Override
	public CompagniesTransport findOne(Long id) {
		return compagniesTransportRepository.findById(id).get();
	}

	@Override
	public CompagniesTransport save(CompagniesTransport compTransport) {
		return compagniesTransportRepository.save(compTransport);
	}

	@Override
	public void delete(Long id) {
		compagniesTransportRepository.deleteById(id);

	}

}