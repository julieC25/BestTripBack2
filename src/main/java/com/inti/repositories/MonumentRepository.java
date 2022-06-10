package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Monument;

@Repository
public interface MonumentRepository extends JpaRepository<Monument, Long>{

}
