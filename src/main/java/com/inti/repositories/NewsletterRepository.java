package com.inti.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Newsletter;;

@Repository
public interface NewsletterRepository extends JpaRepository<Newsletter, Long> {
	List<Newsletter> findByDateParution(Date dateParution);

	@Query(value = "SELECT count(*) FROM Newsletter", nativeQuery = true)
	int nbrNewsletter();
}
