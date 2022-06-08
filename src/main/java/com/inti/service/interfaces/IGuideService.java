package com.inti.service.interfaces;

import java.util.List;
import com.inti.entities.Guide;

public interface IGuideService {
	List<Guide> findAll();

	Guide findOne(Long idGuide);

	Guide save(Guide Guide);

	void delete(Long idGuide);
	
	/*Guide findByType(String type);

	List<Guide> findByTitle(String titre);

	int nbrGuide();*/
}
