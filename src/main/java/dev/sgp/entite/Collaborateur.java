package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ResourceBundle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Collaborateur.
 */
@Entity
@Table(name = "COLLABORATEUR")
public class Collaborateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** The matricule. */
	@Column(name = "MATRICULE", nullable = false, unique = true)
	private String matricule;

	/** The nom. */
	@Column(name = "NOM", nullable = false)
	private String nom;

	/** The prenom. */
	@Column(name = "PRENOM", nullable = false)
	private String prenom;

	/** The date naissance. */
	@Column(name = "NAISSANCE", nullable = false)
	private LocalDate dateNaissance;

	/** The adresse. */
	@Column(name = "ADRESSE", nullable = false)
	private String adresse;

	/** The numero securite social. */
	@Column(name = "NUMERO_SECURITE_SOCIAL", nullable = false)
	private String numeroSecuriteSocial;

	/** The email pro. */
	@Column(name = "EMAIL_PRO")
	private String emailPro;

	/** The photo. */
	@Column(name = "PHOTO")
	private String photo;

	/** The date heure creation. */
	@Column(name = "DATE_HEURE_CREAION", nullable = false)
	private ZonedDateTime dateHeureCreation;

	@ManyToOne
	@JoinColumn(name = "ID_DEPARTEMENTS", nullable = false)
	private Departement departements;

	private static int cmpt = 0;

	/**
	 * Instantiates a new collaborateur.
	 */
	public Collaborateur() {

	}

	/**
	 * Instantiates a new collaborateur.
	 *
	 * @param nom
	 *            the nom
	 * @param prenom
	 *            the prenom
	 * @param dateNaissance
	 *            the date naissance
	 * @param adresse
	 *            the adresse
	 * @param numeroSecuriteSocial
	 *            the numero securite social
	 * @param emailPro
	 *            the email pro
	 * @param photo
	 *            the photo
	 */
	public Collaborateur(String nom, String prenom, LocalDate dateNaissance, String adresse,
			String numeroSecuriteSocial, Departement departement) {
		ResourceBundle properties = ResourceBundle.getBundle("application");
		String suffixe = properties.getString("email");

		this.matricule = "M" + cmpt++;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.numeroSecuriteSocial = numeroSecuriteSocial;
		this.emailPro = nom.toLowerCase() + "." + prenom.toLowerCase() + "@" + suffixe.toLowerCase();
		this.photo = " ";
		this.dateHeureCreation = ZonedDateTime.now();
		this.departements = departement;
	}

	/**
	 * Gets the matricule.
	 *
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * Sets the matricule.
	 *
	 * @param matricule
	 *            the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
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
	 * Gets the prenom.
	 *
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Sets the prenom.
	 *
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Gets the date naissance.
	 *
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * Sets the date naissance.
	 *
	 * @param dateNaissance
	 *            the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * Gets the adresse.
	 *
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Sets the adresse.
	 *
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Gets the numero securite social.
	 *
	 * @return the numeroSecuriteSocial
	 */
	public String getNumeroSecuriteSocial() {
		return numeroSecuriteSocial;
	}

	/**
	 * Sets the numero securite social.
	 *
	 * @param numeroSecuriteSocial
	 *            the numeroSecuriteSocial to set
	 */
	public void setNumeroSecuriteSocial(String numeroSecuriteSocial) {
		this.numeroSecuriteSocial = numeroSecuriteSocial;
	}

	/**
	 * Gets the email pro.
	 *
	 * @return the emailPro
	 */
	public String getEmailPro() {
		return emailPro;
	}

	/**
	 * Sets the email pro.
	 *
	 * @param emailPro
	 *            the emailPro to set
	 */
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	/**
	 * Gets the photo.
	 *
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * Sets the photo.
	 *
	 * @param photo
	 *            the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * Gets the date heure creation.
	 *
	 * @return the dateHeureCreation
	 */
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	/**
	 * Sets the date heure creation.
	 *
	 * @param dateHeureCreation
	 *            the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	/**
	 * @return the departements
	 */
	public Departement getDepartements() {
		return departements;
	}

	/**
	 * @param departements
	 *            the departements to set
	 */
	public void setDepartements(Departement departements) {
		this.departements = departements;
	}

	public void setCollab(Collaborateur collab) {
		this.adresse = collab.getAdresse();
		this.dateHeureCreation = collab.getDateHeureCreation();
		this.dateNaissance = collab.getDateNaissance();
		this.departements = collab.getDepartements();
		this.emailPro = collab.getEmailPro();
		this.matricule = collab.getMatricule();
		this.nom = collab.getNom();
		this.numeroSecuriteSocial = collab.getNumeroSecuriteSocial();
		this.photo = collab.getPhoto();
		this.prenom = collab.getPrenom();
	}

}