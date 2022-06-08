package com.inti.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("hotel")
public class Hotel extends Lieu implements Serializable {
	private Float proprete;
	private Long nbEtoiles;
	private Float prixNuit;
	
	public Hotel() {
		super();
	}
	public Hotel(String nom, String localisation, String nbVisiteurs, Ville ville) {
		super(nom, localisation, nbVisiteurs, ville);
	}
	public Hotel(String nom, String localisation, String nbVisiteurs) {
		super(nom, localisation, nbVisiteurs);
	}
	public Hotel(Float proprete, Long nbEtoiles, Float prixNuit) {
		super();
		this.proprete = proprete;
		this.nbEtoiles = nbEtoiles;
		this.prixNuit = prixNuit;
	}
	public Float getProprete() {
		return proprete;
	}
	public void setProprete(Float proprete) {
		this.proprete = proprete;
	}
	public Long getNbEtoiles() {
		return nbEtoiles;
	}
	public void setNbEtoiles(Long nbEtoiles) {
		this.nbEtoiles = nbEtoiles;
	}
	public Float getPrixNuit() {
		return prixNuit;
	}
	public void setPrixNuit(Float prixNuit) {
		this.prixNuit = prixNuit;
	}
	@Override
	public String toString() {
		return "Hotel [proprete=" + proprete + ", nbEtoiles=" + nbEtoiles + ", prixNuit=" + prixNuit + "]";
	}
	
	
}
