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

@Entity
public class Ville implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVille;
	private String nomVille;
	private String modaliteTransport;
	private Long nbHabitants;
	
	@OneToMany(mappedBy = "ville")
	private List<Lieu> lieux = new ArrayList<>();
	
	@OneToMany(mappedBy = "ville")
	private List<Avis> avis = new ArrayList<>();
	
	//@ManyToOne
	//@JoinColumn(name="idPays")
	//private Pays pays;

	public Ville() {
	}

	public Ville(String nomVille, String modaliteTransport, Long nbHabitants, List<Lieu> lieux) {
		super();
		this.nomVille = nomVille;
		this.modaliteTransport = modaliteTransport;
		this.nbHabitants = nbHabitants;
		this.lieux = lieux;
	}

	public Ville(String nomVille, String modaliteTransport, Long nbHabitants) {
		super();
		this.nomVille = nomVille;
		this.modaliteTransport = modaliteTransport;
		this.nbHabitants = nbHabitants;
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

	@Override
	public String toString() {
		return "Ville [idVille=" + idVille + ", nomVille=" + nomVille + ", modaliteTransport=" + modaliteTransport
				+ ", nbHabitants=" + nbHabitants + ", lieux=" + lieux + "]";
	}
	
	
}
