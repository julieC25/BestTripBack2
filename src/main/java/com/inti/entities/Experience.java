package com.inti.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
//import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Experience implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExperience;
	private String recit;
	private Date date;
	private int dureeExperience;
	private float depense;
	private boolean approbation = true;
	@Lob
	private byte[] image;
	@JsonIgnoreProperties("experiences")
	@ManyToOne
	@JoinColumn(name = "id_pays")
	private Pays pays;
	@JsonIgnoreProperties("experiences")
	@ManyToOne
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;
	@JsonIgnoreProperties("experience")
	@OneToMany(mappedBy = "experience")
	private Set<Avis> aviss;

	public Experience() {
	}
	
	public Experience(String recit, Date date, int dureeExperience, float depense, boolean approbation, byte[] image) {
		this.recit = recit;
		this.date = date;
		this.dureeExperience = dureeExperience;
		this.depense = depense;
		this.approbation = approbation;
		this.image = image;
	}

	public Experience(String recit, Date date, int dureeExperience, float depense, boolean approbation,byte[] image,
			Pays pays, Utilisateur utilisateur) {
		this.recit = recit;
		this.date = date;
		this.dureeExperience = dureeExperience;
		this.depense = depense;
		this.approbation = approbation;
		this.image = image;
		this.pays = pays;
		this.utilisateur = utilisateur;
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

	public int getDureeExperience() {
		return dureeExperience;
	}

	public void setDureeExperience(int dureeExperience) {
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

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
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
				+ dureeExperience + ", depense=" + depense + ", approbation=" + approbation + ", image="
				+ Arrays.toString(image) + "]";
	}

}
