package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Statistique;

@Repository
public interface StatistiqueRepository extends JpaRepository<Statistique, Long>{
	
}
