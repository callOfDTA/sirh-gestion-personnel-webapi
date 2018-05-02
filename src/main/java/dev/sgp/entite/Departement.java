package dev.sgp.entite;

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
	private int id;

	@Column(name = "NOM", nullable = false, unique = true)
	private String nom;

	@Column(name = "DESACTIVATION")
	private boolean desactivation;

	/**
	 * @param id
	 * @param nom
	 * @param desactivation
	 */
	public Departement(String nom, boolean desactivation) {
		this.nom = nom;
		this.desactivation = desactivation;
	}

	public Departement() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the desactivation
	 */
	public boolean isDesactivation() {
		return desactivation;
	}

	/**
	 * @param desactivation
	 *            the desactivation to set
	 */
	public void setDesactivation(boolean desactivation) {
		this.desactivation = desactivation;
	}

}
