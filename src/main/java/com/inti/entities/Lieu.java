package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
public class Lieu implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLieu;
	private String nom;
	private String localisation;
	private String nbVisiteurs;
	@JsonIgnoreProperties("lieux")
	@ManyToOne
	@JoinColumn(name="idVille")
	private Ville ville;
	@JsonIgnoreProperties("lieu")
	@OneToMany(mappedBy = "lieu")
	private List<Avis> avis = new ArrayList<>();
	
	public Lieu() {
	}

	public Lieu(String nom, String localisation, String nbVisiteurs, Ville ville) {
		this.nom = nom;
		this.localisation = localisation;
		this.nbVisiteurs = nbVisiteurs;
		this.ville = ville;
	}

	public Lieu(String nom, String localisation, String nbVisiteurs) {
		this.nom = nom;
		this.localisation = localisation;
		this.nbVisiteurs = nbVisiteurs;
	}
	
	
	public Lieu(String nom, String localisation, String nbVisiteurs, Ville ville, List<Avis> avis) {
		this.nom = nom;
		this.localisation = localisation;
		this.nbVisiteurs = nbVisiteurs;
		this.ville = ville;
		this.avis = avis;
	}

	public Long getIdLieu() {
		return idLieu;
	}

	public void setIdLieu(Long idLieu) {
		this.idLieu = idLieu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public String getNbVisiteurs() {
		return nbVisiteurs;
	}

	public void setNbVisiteurs(String nbVisiteurs) {
		this.nbVisiteurs = nbVisiteurs;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}
	

	public List<Avis> getAvis() {
		return avis;
	}

	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}

	@Override
	public String toString() {
		return "Lieu [idLieu=" + idLieu + ", nom=" + nom + ", localisation=" + localisation + ", nbVisiteurs="
				+ nbVisiteurs + ", ville=" + ville + "]";
	}
	

}
