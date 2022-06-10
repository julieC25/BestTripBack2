package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.CompagnieAerienne;
import com.inti.entities.CompagnieFerroviere;

@Repository
public interface CompagnieFerroviereRepository extends JpaRepository<CompagnieFerroviere, Long>{
	CompagnieFerroviere findBySiret(String siret);
	List<CompagnieFerroviere> findByNom(String nom);

}
