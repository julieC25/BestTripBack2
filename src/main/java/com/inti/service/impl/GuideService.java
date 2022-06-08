package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Guide;
import com.inti.repositories.GuideRepository;
import com.inti.service.interfaces.IGuideService;

@Service
public class GuideService implements IGuideService {
	@Autowired
	GuideRepository guideRepository;

	@Override
	public List<Guide> findAll() {

		return guideRepository.findAll();
	}

	@Override
	public Guide findOne(Long idGuide) {

		return guideRepository.findById(idGuide).get();
	}

	@Override
	public Guide save(Guide guide) {

		return guideRepository.save(guide);
	}

	@Override
	public void delete(Long idguide) {
		guideRepository.deleteById(idguide);

	}

	/*@Override
	public Guide findByType(String type) {
		
		return guideRepository.findByType(type);
	}

	@Override
	public List<Guide> findByTitle(String titre) {
			
		return guideRepository.findByTitle(titre);
	}

	@Override
	public int nbrGuide() {
		
		return guideRepository.nbrGuide();
	}*/

}
