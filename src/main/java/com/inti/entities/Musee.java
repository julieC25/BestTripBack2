package com.inti.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("musee")
public class Musee extends Lieu implements Serializable  {
	private Long entree;
	private boolean accesHandicapes;
	private boolean guideAudio;
	private String style;
	private String horaires;
	public Musee() {
		super();
	}
	public Musee(String nom, String localisation, String nbVisiteurs, Ville ville) {
		super(nom, localisation, nbVisiteurs, ville);
	}
	public Musee(String nom, String localisation, String nbVisiteurs) {
		super(nom, localisation, nbVisiteurs);
	}
	public Musee(Long entree, boolean accesHandicapes, boolean guideAudio, String style, String horaires) {
		super();
		this.entree = entree;
		this.accesHandicapes = accesHandicapes;
		this.guideAudio = guideAudio;
		this.style = style;
		this.horaires = horaires;
	}
	public Long getEntree() {
		return entree;
	}
	public void setEntree(Long entree) {
		this.entree = entree;
	}
	public boolean isAccesHandicapes() {
		return accesHandicapes;
	}
	public void setAccesHandicapes(boolean accesHandicapes) {
		this.accesHandicapes = accesHandicapes;
	}
	public boolean isGuideAudio() {
		return guideAudio;
	}
	public void setGuideAudio(boolean guideAudio) {
		this.guideAudio = guideAudio;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getHoraires() {
		return horaires;
	}
	public void setHoraires(String horaires) {
		this.horaires = horaires;
	}
	@Override
	public String toString() {
		return "Musee [entree=" + entree + ", accesHandicapes=" + accesHandicapes + ", guideAudio=" + guideAudio
				+ ", style=" + style + ", horaires=" + horaires + "]";
	}
	
	

}
