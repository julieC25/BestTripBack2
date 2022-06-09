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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IUtilisateurService;

@RestController
@CrossOrigin
public class UtilisateurController {
	@Autowired
	IUtilisateurService utilisateurService;

	@GetMapping("/utilisateurs")
	public List<Utilisateur> findAll() {
		return utilisateurService.findAll();
	}

	@GetMapping("/utilisateurs/{idUtilisateur}")
	public Utilisateur findOne(@PathVariable("idUtilisateur") Long id) {
		return utilisateurService.findOne(id);
	}

	@PostMapping("/utilisateurs")
	public String saveUtilisateur(@RequestParam("nom") String nom, @RequestParam("prenom") String prenom,
			@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("imageProfil") MultipartFile imageProfil,@RequestParam("email") String email,
			@RequestParam("enabled") boolean enabled,@RequestParam("abonnementNewsletter") boolean abonnementNewsletter) {
		try {
			Utilisateur currenUser = new Utilisateur(nom, prenom, username, password, email, abonnementNewsletter, enabled, null, imageProfil.getBytes());
			currenUser.setImageProfil(imageProfil.getBytes());
			utilisateurService.save(currenUser);
			return "File uploaded successfully! filename=" + imageProfil.getOriginalFilename();
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Fail! maybe you had uploaded the file before or the file's size > 500kb";
		}
	}

	@DeleteMapping("/utilisateurs/{idUtilisateur}")
	public void delete(@PathVariable("idUtilisateur") Long id) {
		utilisateurService.delete(id);
	}

	// update modifie une ligne sans modifier l'id
	@PutMapping("/utilisateurs/{idUtilisateur}")
	public Utilisateur updateUtilisateur(@PathVariable("idUtilisateur") Long id, @RequestBody Utilisateur utilisateur) {
		Utilisateur newUser = utilisateur;
		newUser.setIdUtilisateur(id);
		return utilisateurService.save(newUser);
	}

}
