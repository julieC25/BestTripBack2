package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TypeTransport", discriminatorType = DiscriminatorType.STRING)
public class CompagniesTransport implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompagnie;
	private String nom;
	private String siret;
	private int cout;
	private boolean ponctualite;
	@OneToMany(mappedBy = "compTransport")
	private List<Avis> avis = new ArrayList<>();

	public CompagniesTransport() {
		super();
	}

	public CompagniesTransport(String nom, String siret, int cout, boolean ponctualite, List<Avis> avis) {
		super();
		this.nom = nom;
		this.siret = siret;
		this.cout = cout;
		this.ponctualite = ponctualite;
		this.avis = avis;
	}

	public Long getIdCompagnie() {
		return idCompagnie;
	}

	public void setIdCompagnie(Long idCompagnie) {
		this.idCompagnie = idCompagnie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public int getCout() {
		return cout;
	}

	public void setCout(int cout) {
		this.cout = cout;
	}

	public boolean isPonctualite() {
		return ponctualite;
	}

	public void setPonctualite(boolean ponctualite) {
		this.ponctualite = ponctualite;
	}

	public List<Avis> getAvis() {
		return avis;
	}

	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}

	@Override
	public String toString() {
		return "CompagniesTransport [idCompagnie=" + idCompagnie + ", nom=" + nom + ", siret=" + siret + ", cout="
				+ cout + ", ponctualite=" + ponctualite + ", avis=" + avis + "]";
	}

}
