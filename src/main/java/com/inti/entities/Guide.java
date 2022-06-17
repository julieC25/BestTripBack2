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
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Guide implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGuide;
	private String titre;
	private boolean approbation = true;
	private String type;
	@Lob
	private byte[] fichierPdf;
	@JsonIgnoreProperties("guides")
	@ManyToOne
	@JoinColumn(name = "id_pays")
	private Pays pays;
	@JsonIgnoreProperties("guide")
	@OneToMany(mappedBy = "guide")
	private Set<Avis> avis;

	public Guide() {
	}

	public Guide(String titre, boolean approbation, String type, byte[] fichierPdf) {
		this.titre = titre;
		this.approbation = approbation;
		this.type = type;
		this.fichierPdf = fichierPdf;
	}

	public Guide(String titre, boolean approbation, String type, byte[] fichierPdf, Pays pays) {
		this.titre = titre;
		this.approbation = approbation;
		this.type = type;
		this.fichierPdf = fichierPdf;
		this.pays = pays;
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

	public boolean getApprobation() {
		return approbation;
	}

	public void setApprobation(boolean approbation) {
		this.approbation = approbation;
	}

	public byte[] getFichierPdf() {
		return fichierPdf;
	}

	public void setFichierPdf(byte[] fichierPdf) {
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
