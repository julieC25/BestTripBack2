package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Guide;

@Repository
public interface GuideRepository extends JpaRepository<Guide, Long> {
	/*Guide findByType(String type);

	List<Guide> findByTitle(String titre);

	@Query(value = "SELECT count(*) FROM Guide", nativeQuery = true)
	int nbrGuide();*/

}
