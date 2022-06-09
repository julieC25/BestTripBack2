package com.inti.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
	Experience findByDureeExperience(Date dureeExperience);

	List<Experience> findByDepense(float depense);

	List<Experience> findByRecit(String recit);

	@Query(value = "SELECT count(*) FROM Experience", nativeQuery = true)
	int nbrExperience();

}
