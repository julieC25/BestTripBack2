package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Maritime")
public class CompagnieMaritime extends CompagniesTransport implements Serializable {
	private String modelBateau;

	public CompagnieMaritime() {
		super();
	}

	public CompagnieMaritime(String nom, String siret, int coût, boolean ponctualité, List<Avis> avis) {
		super(nom, siret, coût, ponctualité, avis);
		// TODO Auto-generated constructor stub
	}

	public CompagnieMaritime(String modelBateau) {
		super();
		this.modelBateau = modelBateau;
	}

	public String getModelBateau() {
		return modelBateau;
	}

	public void setModelBateau(String modelBateau) {
		this.modelBateau = modelBateau;
	}

	@Override
	public String toString() {
		return "CompagnieMaritime [modelBateau=" + modelBateau + "]";
	}

}
