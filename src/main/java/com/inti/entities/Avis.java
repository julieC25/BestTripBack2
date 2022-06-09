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
	@ManyToOne
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(name = "id_ville")
	private Ville ville;
	@ManyToOne
	@JoinColumn(name = "id_lieu")
	private Lieu lieu;
	@ManyToOne
	@JoinColumn(name = "id_pays")
	private Pays pays;

	public Avis() {
	}

	public Avis(String titre, int note, String recommandation, CompagniesTransport compTransport) {
		this.titre = titre;
		this.note = note;
		this.recommandation = recommandation;
		this.compTransport = compTransport;
	}

	public Avis(String titre, int note, String recommandation, CompagniesTransport compTransport,
			Utilisateur utilisateur, Ville ville, Lieu lieu, Pays pays) {
		this.titre = titre;
		this.note = note;
		this.recommandation = recommandation;
		this.compTransport = compTransport;
		this.utilisateur = utilisateur;
		this.ville = ville;
		this.lieu = lieu;
		this.pays = pays;
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

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + ", titre=" + titre + ", note=" + note + ", recommandation=" + recommandation
				+ ", compTransport=" + compTransport + ", utilisateur=" + utilisateur + ", ville=" + ville + ", lieu="
				+ lieu + ", pays=" + pays + "]";
	}

}
