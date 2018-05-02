package dev.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTEMENT")
public class Departement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "DESACTIVATION")
	private boolean desactivation;

	public Departement() {
	}

	public Departement(String nom, boolean desactivation) {
		super();
		this.nom = nom;
		this.desactivation = desactivation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
