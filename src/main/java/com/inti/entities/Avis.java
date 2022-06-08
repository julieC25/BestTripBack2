package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Avis implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAvis;
	private String titre;
	private int note;
	private String recommandation;
	@ManyToOne
	@JoinColumn(name = "id_compagnie")
	private CompagniesTransport compTransport;

	public Avis() {
		super();
	}

	public Avis(String titre, int note, String recommandation, CompagniesTransport compTransport) {
		super();
		this.titre = titre;
		this.note = note;
		this.recommandation = recommandation;
		this.compTransport = compTransport;
	}

	public Long getIdAvis() {
		return idAvis;
	}

	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getRecommandation() {
		return recommandation;
	}

	public void setRecommandation(String recommandation) {
		this.recommandation = recommandation;
	}

	public CompagniesTransport getCompTransport() {
		return compTransport;
	}

	public void setCompTransport(CompagniesTransport compTransport) {
		this.compTransport = compTransport;
	}

	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + ", titre=" + titre + ", note=" + note + ", recommandation=" + recommandation
				+ ", compTransport=" + compTransport + "]";
	}

}
