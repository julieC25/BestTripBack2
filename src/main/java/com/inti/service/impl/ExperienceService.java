package com.inti.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Experience;
import com.inti.repositories.ExperienceRepository;
import com.inti.service.interfaces.IExperienceService;

@Service
public class ExperienceService implements IExperienceService {
	@Autowired
	ExperienceRepository experienceRepository;

	@Override
	public List<Experience> findAll() {
		
		return experienceRepository.findAll();
	}

	@Override
	public Experience findOne(Long idexperience) {
		
		return experienceRepository.findById(idexperience).get();
	}

	@Override
	public Experience save(Experience experience) {
		
		return experienceRepository.save(experience);
	}

	@Override
	public void delete(Long idexperience) {
		
		experienceRepository.deleteById(idexperience);

	}

	@Override
	public Experience findByDureeExperience(Date dureeExperience) {
		return experienceRepository.findByDureeExperience(dureeExperience);
	}

	@Override
	public List<Experience> findByDepense(float depense) {

		return experienceRepository.findByDepense(depense);
	}

	@Override
	public List<Experience> findByRecit(String recit) {

		return experienceRepository.findByRecit(recit);
	}

	@Override
	public int nbrExperience() {

		return experienceRepository.nbrExperience();
	}

	@Override
	public int[] countByMonth() {
		List<Experience> experiences = experienceRepository.findAll();
		int[] nbExperience = {0,0,0,0,0,0,0,0,0,0,0,0};
		for (Experience experience : experiences) {
			nbExperience[experience.getDate().getMonth()]++;
		}
		return nbExperience;
	}
}
