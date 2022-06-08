package com.inti.entities;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
@DiscriminatorValue("restaurant")
public class Restaurant extends Lieu implements Serializable {
	private Long nbEtoiles;
	private boolean accesHandicapes;
	private String specialite;
	@Lob
	private byte[] carte;
	
	public Restaurant() {
		super();
	}
	public Restaurant(String nom, String localisation, String nbVisiteurs, Ville ville) {
		super(nom, localisation, nbVisiteurs, ville);
	}
	public Restaurant(String nom, String localisation, String nbVisiteurs) {
		super(nom, localisation, nbVisiteurs);
	}
	public Restaurant(Long nbEtoiles, boolean accesHandicapes, String specialite, byte[] carte) {
		super();
		this.nbEtoiles = nbEtoiles;
		this.accesHandicapes = accesHandicapes;
		this.specialite = specialite;
		this.carte = carte;
	}
	public Restaurant(Long nbEtoiles, boolean accesHandicapes, String specialite) {
		super();
		this.nbEtoiles = nbEtoiles;
		this.accesHandicapes = accesHandicapes;
		this.specialite = specialite;
	}
	public Long getNbEtoiles() {
		return nbEtoiles;
	}
	public void setNbEtoiles(Long nbEtoiles) {
		this.nbEtoiles = nbEtoiles;
	}
	public boolean isAccesHandicapes() {
		return accesHandicapes;
	}
	public void setAccesHandicapes(boolean accesHandicapes) {
		this.accesHandicapes = accesHandicapes;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public byte[] getCarte() {
		return carte;
	}
	public void setCarte(byte[] carte) {
		this.carte = carte;
	}
	@Override
	public String toString() {
		return "Restaurant [nbEtoiles=" + nbEtoiles + ", accesHandicapes=" + accesHandicapes + ", specialite="
				+ specialite + ", carte=" + Arrays.toString(carte) + "]";
	}
	
	

}
