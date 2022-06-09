package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Pays;

@Repository
public interface PaysRepository extends JpaRepository<Pays, Long> {
	List<Pays> findByNomPays(String nomPays);

	List<Pays> findBySecurite(String securite);

	List<Pays> findByLangue(String langue);

	@Query(value = "SELECT count(*) FROM Pays", nativeQuery = true)
	int nbrPays();
}
