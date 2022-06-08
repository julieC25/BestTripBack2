package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Musee;

@Repository
public interface MuseeRepository extends JpaRepository<Musee, Long>{

}
