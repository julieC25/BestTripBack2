package com.inti.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
public class Continent implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContinent;
	private String nomContinent;
	
	public Continent() {
	}

	public Continent(String nomContinent) {
		super();
		this.nomContinent = nomContinent;
	}

	public Long getIdContinent() {
		return idContinent;
	}

	public void setIdContinent(Long idContinent) {
		this.idContinent = idContinent;
	}

	public String getNomContinent() {
		return nomContinent;
	}

	public void setNomContinent(String nomContinent) {
		this.nomContinent = nomContinent;
	}

	@Override
	public String toString() {
		return "Continent [idContinent=" + idContinent + ", nomContinent=" + nomContinent + "]";
	}
	
	

}
