package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Newsletter implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idNewsletter;
	private Date dateParution;
	
	@ManyToOne
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;

	public Newsletter() {
	}

	public Newsletter(Date dateParution) {
		this.dateParution = dateParution;
	}

	public Long getIdNewsletter() {
		return idNewsletter;
	}

	public void setIdNewsletter(Long idNewsletter) {
		this.idNewsletter = idNewsletter;
	}

	public Date getDateParution() {
		return dateParution;
	}

	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}

	@Override
	public String toString() {
		return "Newsletter [idNewsletter=" + idNewsletter + ", dateParution=" + dateParution + "]";
	}

}
