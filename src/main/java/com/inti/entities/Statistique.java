package com.inti.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.inti.service.interfaces.IPointStatistiqueService;

@Entity
public class Statistique implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idStatistique;
	@Column(unique = true)
	private String titre;
	private String nomAxeX;
	private String nomAxeY;
	@JsonIgnoreProperties("statistique")
	@OneToMany(mappedBy = "statistique")
	private Set<PointStatistique> valeurs;
	@JsonIgnoreProperties("statistiques")
	@ManyToOne
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;
	
	public Statistique() {
		
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

	
	public String getNomAxeX() {
		return nomAxeX;
	}

	public void setNomAxeX(String nomAxeX) {
		this.nomAxeX = nomAxeX;
	}

	public String getNomAxeY() {
		return nomAxeY;
	}

	public void setNomAxeY(String nomAxeY) {
		this.nomAxeY = nomAxeY;
	}

	public Set<PointStatistique> getValeurs() {
		return valeurs;
	}

	public void setValeurs(Set<PointStatistique> valeurs) {
		this.valeurs = valeurs;
	}

	public Statistique(String titre, String nomAxeX, String nomAxeY, Utilisateur utilisateur) {
		this.titre = titre;
		this.nomAxeX = nomAxeX;
		this.nomAxeY = nomAxeY;
		this.utilisateur = utilisateur;
	}
	
	public void addOnePointStatistique(PointStatistique pointStatistique) {
		this.valeurs.add(pointStatistique);
	}
}