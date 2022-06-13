package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.CompagniesTransport;

@Repository
public interface CompagniesTransportRepository extends JpaRepository<CompagniesTransport, Long>{
	CompagniesTransport findBySiret(String siret);
	List<CompagniesTransport> findByNom(String nom);

}
