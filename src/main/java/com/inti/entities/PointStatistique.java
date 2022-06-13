package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PointStatistique implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPoint;
	private String valeurX;
	private float valeurY;
	@ManyToOne
	@JoinColumn(name="id_statistique")
	private Statistique statistique;
	
	public PointStatistique() {
		
	}
	public PointStatistique(String valeurX, float valeurY, Statistique statistique) {
		this.valeurX = valeurX;
		this.valeurY = valeurY;
		this.statistique = statistique;
	}
	public Long getIdPoint() {
		return idPoint;
	}
	public void setIdPoint(Long idPoint) {
		this.idPoint = idPoint;
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
	public Statistique getStatistique() {
		return statistique;
	}
	public void setStatistique(Statistique statistique) {
		this.statistique = statistique;
	}
	

}
