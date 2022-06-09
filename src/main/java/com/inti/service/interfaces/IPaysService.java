package com.inti.service.interfaces;

import java.util.List;
import com.inti.entities.Pays;

public interface IPaysService {
	List<Pays> findAll();

	Pays findOne(Long idPays);

	Pays save(Pays pays);

	void delete(Long idPays);
	
	/*List<Pays> findByNomPays (String nomPays);
	
	List<Pays> findBySecurity(String security);

	List<Pays> findByLanguage(String langue);

	int nbrPays();*/
}
