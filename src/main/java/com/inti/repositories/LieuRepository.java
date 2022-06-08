package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Lieu;

@Repository
public interface LieuRepository extends JpaRepository<Lieu, Long>{

}
