package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.PointStatistique;

@Repository
public interface PointStatistiqueRepository extends JpaRepository<PointStatistique, Long>{
	
}
