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
	private String nomPays;
	private String securite;
	private String langue;
	private int surface;
	private boolean conduiteSens = true;
	private String visa;
	private String numeroUtile;

	@OneToMany(mappedBy = "pays")
	private List<Guide> guides = new ArrayList<>();
	@OneToMany(mappedBy = "pays")
	private List<Experience> experiences = new ArrayList<>();
	@OneToMany(mappedBy = "pays")
	private List<Ville> villes = new ArrayList<>();
	@OneToMany(mappedBy = "pays")
	private List<Avis> avis = new ArrayList<>();

	public Pays() {
	}

	public Pays(String nomPays, String securite, String langue, int surface, boolean conduiteSens, String visa,
			String numeroUtile) {
		this.nomPays = nomPays;
		this.securite = securite;
		this.langue = langue;
		this.surface = surface;
		this.conduiteSens = conduiteSens;
		this.visa = visa;
		this.numeroUtile = numeroUtile;
	}

	public Pays(String nomPays, String securite, String langue, int surface, boolean conduiteSens, String visa,
			String numeroUtile, List<Guide> guides, List<Experience> experiences, List<Ville> villes, List<Avis> avis) {
		this.nomPays = nomPays;
		this.securite = securite;
		this.langue = langue;
		this.surface = surface;
		this.conduiteSens = conduiteSens;
		this.visa = visa;
		this.numeroUtile = numeroUtile;
		this.guides = guides;
		this.experiences = experiences;
		this.villes = villes;
		this.avis = avis;
	}

	public Long getIdPays() {
		return idPays;
	}

	public void setIdPays(Long idPays) {
		this.idPays = idPays;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
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

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public boolean isConduiteSens() {
		return conduiteSens;
	}

	public void setConduiteSens(boolean conduiteSens) {
		this.conduiteSens = conduiteSens;
	}

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}

	public String getNumeroUtile() {
		return numeroUtile;
	}

	public void setNumeroUtile(String numeroUtile) {
		this.numeroUtile = numeroUtile;
	}

	public List<Guide> getGuides() {
		return guides;
	}

	public void setGuides(List<Guide> guides) {
		this.guides = guides;
	}

	public List<Experience> getExperiences() {
		return experiences;
	}

	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

	public List<Avis> getAvis() {
		return avis;
	}

	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}

	@Override
	public String toString() {
		return "Pays [idPays=" + idPays + ", nomPays=" + nomPays + ", securite=" + securite + ", langue=" + langue
				+ ", surface=" + surface + ", conduiteSens=" + conduiteSens + ", visa=" + visa + ", numeroUtile="
				+ numeroUtile + "]";
	}

}
