package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.CompagnieMaritime;
import com.inti.entities.LocationVoitures;

@Repository
public interface LocationVoituresRepository extends JpaRepository<LocationVoitures, Long>{
	LocationVoitures findBySiret(String siret);
	List<LocationVoitures> findByNom(String nom);

}
