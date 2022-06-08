package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pays implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPays;
	private String nom;
	private String securite;
	private String langue;
	private String surface;
	private boolean conduiteSens = true;
	private int visa;
	private String numeroUtile;
	
	@OneToMany(mappedBy = "pays")
	private List<Guide> guides = new ArrayList<>();
	@OneToMany(mappedBy = "pays")
	private List<Experience> experiences = new ArrayList<>();
	@OneToMany(mappedBy = "pays")
	private List<Ville> villes = new ArrayList<>();

	public Pays() {
	}

	public Pays(String nom, String securite, String langue, String surface, boolean conduiteSens, int visa,
			String numeroUtile) {
		this.nom = nom;
		this.securite = securite;
		this.langue = langue;
		this.surface = surface;
		this.conduiteSens = conduiteSens;
		this.visa = visa;
		this.numeroUtile = numeroUtile;
	}

	public Long getIdPays() {
		return idPays;
	}

	public void setIdPays(Long idPays) {
		this.idPays = idPays;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSecurite() {
		return securite;
	}

	public void setSecurite(String securite) {
		this.securite = securite;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public String getSurface() {
		return surface;
	}

	public void setSurface(String surface) {
		this.surface = surface;
	}

	public boolean isConduiteSens() {
		return conduiteSens;
	}

	public void setConduiteSens(boolean conduiteSens) {
		this.conduiteSens = conduiteSens;
	}

	public int getVisa() {
		return visa;
	}

	public void setVisa(int visa) {
		this.visa = visa;
	}

	public String getNumeroUtile() {
		return numeroUtile;
	}

	public void setNumeroUtile(String numeroUtile) {
		this.numeroUtile = numeroUtile;
	}

	@Override
	public String toString() {
		return "Pays [idPays=" + idPays + ", nom=" + nom + ", securite=" + securite + ", langue=" + langue + ", surface="
				+ surface + ", conduiteSens=" + conduiteSens + ", visa=" + visa + ", numeroUtile=" + numeroUtile + "]";
	}

}
