package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.CompagnieFerroviere;
import com.inti.entities.CompagnieMaritime;

@Repository
public interface CompagnieMaritimeRepository extends JpaRepository<CompagnieMaritime, Long>{
	CompagnieMaritime findBySiret(String siret);
	List<CompagnieMaritime> findByNom(String nom);

}
