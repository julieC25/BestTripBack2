package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Newsletter;
import com.inti.service.interfaces.INewsletterService;

@RestController 
@CrossOrigin
public class NewsletterController {
	@Autowired 
	INewsletterService NewsletterService;

	@GetMapping("/Newsletters")
	public List<Newsletter> findAll() {
		return NewsletterService.findAll();
	}

	@GetMapping("/Newsletters/{idN}") 
	public Newsletter findOne(@PathVariable("idN") Long idNewsletter) {
		return NewsletterService.findOne(idNewsletter); 
	}

	@PostMapping("/Newsletters") 
	public Newsletter saveNewsletter(@RequestBody Newsletter Newsletter) {
		return NewsletterService.save(Newsletter);
	}

	@DeleteMapping("/Newsletters/{idNewsletter}")
	public void deleteNewsletter(@PathVariable("idNewsletter") Long idNewsletter) {
		NewsletterService.delete(idNewsletter);
	}

	@PutMapping("/Newsletters/{idN}")
	public Newsletter updateNewsletter(@PathVariable("idN") Long idNewsletter, @RequestBody Newsletter newsletter) {
		Newsletter currentNewsletter = NewsletterService.findOne(idNewsletter);
		currentNewsletter.setDateParution(newsletter.getDateParution());
		return NewsletterService.save(currentNewsletter);
	}
}
