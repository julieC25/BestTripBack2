package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("Aerien")
public class CompagnieAerienne extends CompagniesTransport implements Serializable {
	private boolean collation;
	private String modelAvion;

	public CompagnieAerienne() {
		super();
	}

	public CompagnieAerienne(String nom, String siret, int coût, boolean ponctualité, List<Avis> avis) {
		super(nom, siret, coût, ponctualité, avis);
	}

	public CompagnieAerienne(boolean collation, String modelAvion) {
		super();
		this.collation = collation;
		this.modelAvion = modelAvion;
	}

	public boolean isCollation() {
		return collation;
	}

	public void setCollation(boolean collation) {
		this.collation = collation;
	}

	public String getModelAvion() {
		return modelAvion;
	}

	public void setModelAvion(String modelAvion) {
		this.modelAvion = modelAvion;
	}

	@Override
	public String toString() {
		return "CompagnieAerienne [collation=" + collation + ", modelAvion=" + modelAvion + "]";
	}

}
