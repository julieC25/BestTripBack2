package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Ferroviere")
public class CompagnieFerroviere extends CompagniesTransport implements Serializable {
	public boolean wagonBar;
	public boolean nuit;

	public CompagnieFerroviere() {
		super();
	}

	public CompagnieFerroviere(String nom, String siret, int coût, boolean ponctualité, List<Avis> avis) {
		super(nom, siret, coût, ponctualité, avis);
	}

	public CompagnieFerroviere(boolean wagonBar, boolean nuit) {
		super();
		this.wagonBar = wagonBar;
		this.nuit = nuit;
	}

	public boolean isWagonBar() {
		return wagonBar;
	}

	public void setWagonBar(boolean wagonBar) {
		this.wagonBar = wagonBar;
	}

	public boolean isNuit() {
		return nuit;
	}

	public void setNuit(boolean nuit) {
		this.nuit = nuit;
	}

	@Override
	public String toString() {
		return "CompagnieFerroviere [wagonBar=" + wagonBar + ", nuit=" + nuit + "]";
	}

}
