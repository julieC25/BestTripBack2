package com.inti.service.interfaces;

import java.util.Date;
import java.util.List;
import com.inti.entities.Experience;

public interface IExperienceService {
	List<Experience> findAll();

	Experience findOne(Long idExperience);

	Experience save(Experience Experience);

	void delete(Long idExperience);

	Experience findByDureeExperience(Date dureeExperience);

	List<Experience> findByDepense(float depense);

	List<Experience> findByRecit(String recit);

	int nbrExperience();
}
