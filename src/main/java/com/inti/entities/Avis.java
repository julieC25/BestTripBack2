package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Avis implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAvis;
	private String titre;
	private int note;
	private String recommandation;
	private String description;
	@JsonIgnoreProperties("avis")
	@ManyToOne
	@JoinColumn(name = "id_compagnie")
	private CompagniesTransport compTransport;
	@JsonIgnoreProperties("avisListe")
	@ManyToOne
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;
	@JsonIgnoreProperties("avis")
	@ManyToOne
	@JoinColumn(name = "id_lieu")
	private Lieu lieu;
	@JsonIgnoreProperties("avis")
	@ManyToOne
	@JoinColumn(name = "id_experience")
	private Experience experience;
	@JsonIgnoreProperties("avis")
	@ManyToOne
	@JoinColumn(name = "id_guide")
	private Guide guide;

	public Avis() {
	}

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public Guide getGuide() {
		return guide;
	}

	public void setGuide(Guide guide) {
		this.guide = guide;
	}

	public Avis(String titre, int note, String recommandation, CompagniesTransport compTransport) {
		this.titre = titre;
		this.note = note;
		this.recommandation = recommandation;
		this.compTransport = compTransport;
	}

	public Avis(String titre, int note, String recommandation, CompagniesTransport compTransport,
			Utilisateur utilisateur, Ville ville, Lieu lieu, Pays pays) {
		this.titre = titre;
		this.note = note;
		this.recommandation = recommandation;
		this.compTransport = compTransport;
		this.utilisateur = utilisateur;
		this.lieu = lieu;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getIdAvis() {
		return idAvis;
	}

	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getRecommandation() {
		return recommandation;
	}

	public void setRecommandation(String recommandation) {
		this.recommandation = recommandation;
	}

	public CompagniesTransport getCompTransport() {
		return compTransport;
	}

	public void setCompTransport(CompagniesTransport compTransport) {
		this.compTransport = compTransport;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + ", titre=" + titre + ", note=" + note + ", recommandation=" + recommandation
				+ ", compTransport=" + compTransport + ", utilisateur=" + utilisateur;
	}

}
