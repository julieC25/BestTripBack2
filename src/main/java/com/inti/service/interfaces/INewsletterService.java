package com.inti.service.interfaces;

import java.util.Date;
import java.util.List;
import com.inti.entities.Newsletter;

public interface INewsletterService {
	List<Newsletter> findAll();

	Newsletter findOne(Long idNewsletter);

	Newsletter save(Newsletter Newsletter);

	void delete(Long idNewsletter);

	/*List<Newsletter> findByDate(Date dateParution);

	int nbrNewsletter();*/
}
