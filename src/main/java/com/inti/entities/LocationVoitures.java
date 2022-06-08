package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("LocVoiture")
public class LocationVoitures extends CompagniesTransport implements Serializable {
	private String caution;
	private String modelVoiture;
	private String etat;

	public LocationVoitures() {
		super();
	}

	public LocationVoitures(String nom, String siret, int coût, boolean ponctualité, List<Avis> avis) {
		super(nom, siret, coût, ponctualité, avis);
	}

	public LocationVoitures(String caution, String modelVoiture, String etat) {
		super();
		this.caution = caution;
		this.modelVoiture = modelVoiture;
		this.etat = etat;
	}

	public String getCaution() {
		return caution;
	}

	public void setCaution(String caution) {
		this.caution = caution;
	}

	public String getModelVoiture() {
		return modelVoiture;
	}

	public void setModelVoiture(String modelVoiture) {
		this.modelVoiture = modelVoiture;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "LocationVoitures [caution=" + caution + ", modelVoiture=" + modelVoiture + ", etat=" + etat + "]";
	}

}
