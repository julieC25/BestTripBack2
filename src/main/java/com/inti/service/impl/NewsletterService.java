package com.inti.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Newsletter;
import com.inti.repositories.NewsletterRepository;
import com.inti.service.interfaces.INewsletterService;

@Service
public class NewsletterService implements INewsletterService {
	@Autowired
	NewsletterRepository newsletterRepository;

	@Override
	public List<Newsletter> findAll() {

		return newsletterRepository.findAll();
	}

	@Override
	public Newsletter findOne(Long idNewsletter) {

		return newsletterRepository.findById(idNewsletter).get();
	}

	@Override
	public Newsletter save(Newsletter Newsletter) {

		return newsletterRepository.save(Newsletter);
	}

	@Override
	public void delete(Long idNewsletter) {

		newsletterRepository.findById(idNewsletter);
	}

	/*@Override
	public List<Newsletter> findByDate(Date dateParution) {

		return newsletterRepository.findByDate(dateParution);
	}

	@Override
	public int nbrNewsletter() {

		return newsletterRepository.nbrNewsletter();
	}*/

}
