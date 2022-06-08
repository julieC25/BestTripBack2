package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("monument")
public class Monument extends Lieu implements Serializable {
	private String description;
	private Date dateConstruction;
	private Long horaires;
	public Monument() {
		super();
	}
	public Monument(String nom, String localisation, String nbVisiteurs, Ville ville) {
		super(nom, localisation, nbVisiteurs, ville);
	}
	public Monument(String nom, String localisation, String nbVisiteurs) {
		super(nom, localisation, nbVisiteurs);
	}
	public Monument(String description, Date dateConstruction, Long horaires) {
		super();
		this.description = description;
		this.dateConstruction = dateConstruction;
		this.horaires = horaires;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateConstruction() {
		return dateConstruction;
	}
	public void setDateConstruction(Date dateConstruction) {
		this.dateConstruction = dateConstruction;
	}
	public Long getHoraires() {
		return horaires;
	}
	public void setHoraires(Long horaires) {
		this.horaires = horaires;
	}
	@Override
	public String toString() {
		return "Monument [description=" + description + ", dateConstruction=" + dateConstruction + ", horaires="
				+ horaires + "]";
	} 
	
}
