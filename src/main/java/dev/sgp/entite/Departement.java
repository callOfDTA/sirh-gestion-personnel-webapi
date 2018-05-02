package dev.sgp.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Departement.
 */
@Entity
@Table(name = "DEPARTEMENT")
public class Departement {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** The nom. */
	@Column(name = "NOM", nullable = false)
	private String nom;

	/** The desactivation. */
	@Column(name = "DESACTIVATION", nullable = false)
	private boolean desactivation;

	/**
	 * Instantiates a new departement.
	 */
	public Departement() {
	}

	/**
	 * Instantiates a new departement.
	 *
	 * @param nom
	 *            the nom
	 * @param desactivation
	 *            the desactivation
	 */
	public Departement(String nom, boolean desactivation) {
		this.nom = nom;
		this.desactivation = desactivation;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Sets the nom.
	 *
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Checks if is desactivation.
	 *
	 * @return the desactivation
	 */
	public boolean isDesactivation() {
		return desactivation;
	}

	/**
	 * Sets the desactivation.
	 *
	 * @param desactivation
	 *            the desactivation to set
	 */
	public void setDesactivation(boolean desactivation) {
		this.desactivation = desactivation;
	}

}
