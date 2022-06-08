package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Guide implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGuide;
	private String titre;
	private String approbation;
	private String fichierPdf;
	private String type;

	@ManyToOne
	@JoinColumn(name = "id_pays")
	private Pays pays;

	public Guide() {
	}

	public Guide(String titre, String approbation, String fichierPdf, String type) {
		this.titre = titre;
		this.approbation = approbation;
		this.fichierPdf = fichierPdf;
		this.type = type;
	}

	public Long getIdGuide() {
		return idGuide;
	}

	public void setIdGuide(Long idGuide) {
		this.idGuide = idGuide;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getApprobation() {
		return approbation;
	}

	public void setApprobation(String approbation) {
		this.approbation = approbation;
	}

	public String getFichierPdf() {
		return fichierPdf;
	}

	public void setFichierPdf(String fichierPdf) {
		this.fichierPdf = fichierPdf;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Guide [idGuide=" + idGuide + ", titre=" + titre + ", approbation=" + approbation + ", fichierPdf="
				+ fichierPdf + ", type=" + type + "]";
	}

}
