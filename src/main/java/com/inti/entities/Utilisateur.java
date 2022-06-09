package com.inti.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String nom;
	private String prenom;
	@Column(unique = true)
	private String username;
	private String password;
	private String email;
	private boolean abonnementNewsletter;
	private boolean enabled;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="GUIDE_AUTHEUR",joinColumns = @JoinColumn(name="id_user",referencedColumnName="idUtilisateur"),
					   inverseJoinColumns = @JoinColumn(name="id_guide",referencedColumnName="idGuide"))
	private Set<Guide> guides = new HashSet<>();
	@Lob
	private byte[] imageProfil;
	@OneToMany(mappedBy = "utilisateur")
	private Set<Statistique> statistiques;
	@OneToMany(mappedBy = "utilisateur")
	private Set<Avis> avisListe;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="PROFILS",joinColumns = @JoinColumn(name="id_user",referencedColumnName="idUtilisateur"),
					   inverseJoinColumns = @JoinColumn(name="id_role",referencedColumnName="idRole"))
	private Set<Role> roles = new HashSet<>();
	@OneToMany(mappedBy = "utilisateur")
	private Set<Newsletter> newsletters;
	@OneToMany(mappedBy = "utilisateur")
	private Set<Experience> experiences;
	
	
	public Utilisateur() {
		
	}
	
	public Utilisateur(String nom, String prenom, String username, String password, String email,
			boolean abonnementNewsletter, boolean enabled, Set<Role> roles, byte[] imageProfil) {
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
		this.email = email;
		this.abonnementNewsletter = abonnementNewsletter;
		this.enabled = enabled;
		this.roles = roles;
		this.imageProfil = imageProfil;
	}
	
	

	public Set<Avis> getAvisListe() {
		return avisListe;
	}

	public void setAvisListe(Set<Avis> avisListe) {
		this.avisListe = avisListe;
	}

	public Set<Statistique> getStatistiques() {
		return statistiques;
	}

	public void setStatistiques(Set<Statistique> statistiques) {
		this.statistiques = statistiques;
	}

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isAbonnementNewsletter() {
		return abonnementNewsletter;
	}


	public void setAbonnementNewsletter(boolean abonnementNewsletter) {
		this.abonnementNewsletter = abonnementNewsletter;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public byte[] getImageProfil() {
		return imageProfil;
	}


	public void setImageProfil(byte[] imageProfil) {
		this.imageProfil = imageProfil;
	}


	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}


	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nom=" + nom + ", prenom=" + prenom + ", username="
				+ username + ", password=" + password + ", email=" + email + ", abonnementNewsletter="
				+ abonnementNewsletter + ", enabled=" + enabled + ", imageProfil=" + Arrays.toString(imageProfil) + "]";
	}
	
}
