package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Avis;
import com.inti.entities.LocationVoitures;

@Repository
public interface AvisRepository extends JpaRepository<Avis, Long>{
	List<Avis> findByNote(int note);

}
