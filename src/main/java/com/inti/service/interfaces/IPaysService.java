package com.inti.service.interfaces;

import java.util.List;
import com.inti.entities.Pays;

public interface IPaysService {
	List<Pays> findAll();

	Pays findOne(Long idPays);

	Pays save(Pays pays);

	void delete(Long idPays);
	
	List<Pays> findByNomPays(String nomPays);
	
	List<Pays> findBySecurite(String securite);

	List<Pays> findByLangue(String langue);

	int nbrPays();
}
