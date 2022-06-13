package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Continent;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long>{
	

}
