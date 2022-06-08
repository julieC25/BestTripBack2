package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.CompagnieAerienne;
import com.inti.entities.CompagniesTransport;

@Repository
public interface CompagnieAerienneRepository extends JpaRepository<CompagnieAerienne, Long>{
	CompagnieAerienne findBySiret(String siret);
	List<CompagnieAerienne> findByNom(String nom);

}
