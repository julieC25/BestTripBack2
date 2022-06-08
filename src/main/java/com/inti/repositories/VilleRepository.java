package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Ville;

@Repository
public interface VilleRepository extends JpaRepository<Ville, Long>{

}
