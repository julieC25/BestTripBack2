package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Ville implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVille;
	private String nomVille;
	private String modaliteTransport;
	private Long nbHabitants;
	@JsonIgnoreProperties("ville")
	@OneToMany(mappedBy = "ville")
	private List<Lieu> lieux = new ArrayList<>();
	@JsonIgnoreProperties("villes")
	@ManyToOne
	@JoinColumn(name="idPays")
	private Pays pays;

	public Ville() {
	}

	public Ville(String nomVille, String modaliteTransport, Long nbHabitants, List<Lieu> lieux) {
		this.nomVille = nomVille;
		this.modaliteTransport = modaliteTransport;
		this.nbHabitants = nbHabitants;
		this.lieux = lieux;
	}

	public Ville(String nomVille, String modaliteTransport, Long nbHabitants) {
		this.nomVille = nomVille;
		this.modaliteTransport = modaliteTransport;
		this.nbHabitants = nbHabitants;
	}
	
	public Ville(String nomVille, String modaliteTransport, Long nbHabitants, List<Lieu> lieux, List<Avis> avis,
			Pays pays) {
		this.nomVille = nomVille;
		this.modaliteTransport = modaliteTransport;
		this.nbHabitants = nbHabitants;
		this.lieux = lieux;
		this.pays = pays;
	}

	public Long getIdVille() {
		return idVille;
	}

	public void setIdVille(Long idVille) {
		this.idVille = idVille;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public String getModaliteTransport() {
		return modaliteTransport;
	}

	public void setModaliteTransport(String modaliteTransport) {
		this.modaliteTransport = modaliteTransport;
	}

	public Long getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(Long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public List<Lieu> getLieux() {
		return lieux;
	}

	public void setLieux(List<Lieu> lieux) {
		this.lieux = lieux;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Ville [idVille=" + idVille + ", nomVille=" + nomVille + ", modaliteTransport=" + modaliteTransport
				+ ", nbHabitants=" + nbHabitants + ", lieux=" + lieux + "]";
	}
	
	
}
