package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Pays;
import com.inti.repositories.PaysRepository;
import com.inti.service.interfaces.IPaysService;

@Service
public class PaysService implements IPaysService {
	@Autowired
	PaysRepository paysRepository;

	@Override
	public List<Pays> findAll() {
		
		return paysRepository.findAll();
	}

	@Override
	public Pays findOne(Long idPays) {
		
		return paysRepository.findById(idPays).get();
	}

	@Override
	public Pays save(Pays pays) {
		
		return paysRepository.save(pays);
	}

	@Override
	public void delete(Long idPays) {
		
		paysRepository.findById(idPays);
	}

	@Override
	public List<Pays> findByNomPays(String nomPays) {
		
		return paysRepository.findByNomPays(nomPays);
	}

	@Override
	public List<Pays> findBySecurite(String security) {
		
		return paysRepository.findBySecurite(security);
	}

	@Override
	public List<Pays> findByLangue(String langue) {
		
		return paysRepository.findByLangue(langue);
	}

	@Override
	public int nbrPays() {
		return paysRepository.nbrPays();
	}
}
