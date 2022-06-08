package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Statistique implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idStatistique;
	@Column(unique = true)
	private String titre;
	private String valeurX;
	private float valeurY;
	@ManyToOne
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;
	
	
	public Statistique() {
		
	}
	
	public Statistique(String titre, String nomAxeX, String nomAxeY, int nbValeurs, String valeurX,
			float valeurY, Utilisateur utilisateur) {
		this.titre = titre;
		this.valeurX = valeurX;
		this.valeurY = valeurY;
		this.utilisateur = utilisateur;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Long getIdStatistique() {
		return idStatistique;
	}
	public void setIdStatistique(Long idStatistique) {
		this.idStatistique = idStatistique;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getValeurX() {
		return valeurX;
	}
	public void setValeurX(String valeurX) {
		this.valeurX = valeurX;
	}
	public float getValeurY() {
		return valeurY;
	}
	public void setValeurY(float valeurY) {
		this.valeurY = valeurY;
	}

	
}