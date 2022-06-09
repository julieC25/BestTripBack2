package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Experience implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExperience;
	private String recit;
	private Date date;
	private Date dureeExperience;
	private float depense;
	private boolean approbation = true;
	// @Lob
	// private byte[] image;
	@ManyToOne
	@JoinColumn(name = "id_pays")
	private Pays pays;
	@ManyToOne
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;

	public Experience() {
	}

	public Experience(String recit, Date date, Date dureeExperience, float depense, boolean approbation, Pays pays) {
		this.recit = recit;
		this.date = date;
		this.dureeExperience = dureeExperience;
		this.depense = depense;
		this.approbation = approbation;
	}

	public Long getIdExperience() {
		return idExperience;
	}

	public void setIdExperience(Long idExperience) {
		this.idExperience = idExperience;
	}

	public String getRecit() {
		return recit;
	}

	public void setRecit(String recit) {
		this.recit = recit;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDureeExperience() {
		return dureeExperience;
	}

	public void setDureeExperience(Date dureeExperience) {
		this.dureeExperience = dureeExperience;
	}

	public float getDepense() {
		return depense;
	}

	public void setDepense(float depense) {
		this.depense = depense;
	}

	public boolean isApprobation() {
		return approbation;
	}

	public void setApprobation(boolean approbation) {
		this.approbation = approbation;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Experience [idExperience=" + idExperience + ", recit=" + recit + ", date=" + date + ", dureeExperience="
				+ dureeExperience + ", depense=" + depense + ", approbation=" + approbation + "]";
	}

}
