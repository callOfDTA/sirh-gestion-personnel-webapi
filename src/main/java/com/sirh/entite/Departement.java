package com.sirh.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departement")
public class Departement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NOM", nullable = false)
	private String nom;

	@Column(name = "DESACTIVATION", nullable = false)
	private boolean desactivation;

	public Departement() {

	}

	public Departement(String nom, boolean desactivation) {
		this.nom = nom;
		this.desactivation = desactivation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isDesactivation() {
		return desactivation;
	}

	public void setDesactivation(boolean desactivation) {
		this.desactivation = desactivation;
	}
}
