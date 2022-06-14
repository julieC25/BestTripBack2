package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Newsletter implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idNewsletter;
	private String nom;
	private Date dateParution;
	private String corps;

	@ManyToOne
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;

	public Newsletter() {
	}

	public Newsletter(Date dateParution) {
		this.dateParution = dateParution;
	}

	public Newsletter(Date dateParution, Utilisateur utilisateur) {
		this.dateParution = dateParution;
		this.utilisateur = utilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Long getIdNewsletter() {
		return idNewsletter;
	}
	
	
	public String getCorps() {
		return corps;
	}

	public void setCorps(String corps) {
		this.corps = corps;
	}

	public void setIdNewsletter(Long idNewsletter) {
		this.idNewsletter = idNewsletter;
	}

	public Date getDateParution() {
		return dateParution;
	}

	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Newsletter [idNewsletter=" + idNewsletter + ", dateParution=" + dateParution + "]";
	}

}
