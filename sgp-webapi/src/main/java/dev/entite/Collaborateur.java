package dev.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "COLLABORATEUR")
public class Collaborateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "MATRICULE", unique = true)
	private String matricule;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRENOM")
	private String prenom;
	@Column(name = "NAISSANCE")
	private LocalDate naissance;
	@Column(name = "ADRESSE")
	private String adresse;
	@Column(name = "SECURITE")
	private String securite;
	@Column(name = "EMAIL")
	private String emailpro;
	@Column(name = "PHOTO")
	private String photo;
	@Column(name = "DATE_CREATION")
	private ZonedDateTime dateHeureCreation;

	@PrePersist
	private void heuredecreation() {
		dateHeureCreation = ZonedDateTime.now();
	}

	@ManyToOne
	@JoinColumn(name = "DEPARTEMENT_ID", nullable = false)
	private Departement departement;

	@Column(name = "NOM_BANQUE")
	private String nombanque;
	@Column(name = "NUM_COMPTE")
	private String numcompte;

	public Collaborateur() {
	}

	public Collaborateur(String matricule, String nom, String prenom, LocalDate naissance, String adresse,
			String securite, String emailpro, String photo, ZonedDateTime dateHeureCreation) {
		this.adresse = adresse;
		this.dateHeureCreation = dateHeureCreation;
		this.emailpro = emailpro;
		this.matricule = matricule;
		this.naissance = naissance;
		this.nom = nom;
		this.photo = photo;
		this.prenom = prenom;
		this.securite = securite;
	}

	public Collaborateur(String matricule, String nom, String prenom, LocalDate naissance, String adresse,
			String securite, String emailpro, String photo, ZonedDateTime dateHeureCreation, Departement departement,
			String nombanque, String numcompte) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
		this.adresse = adresse;
		this.securite = securite;
		this.emailpro = emailpro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.departement = departement;
		this.nombanque = nombanque;
		this.numcompte = numcompte;
	}

	public String getNombanque() {
		return nombanque;
	}

	public void setNombanque(String nombanque) {
		this.nombanque = nombanque;
	}

	public String getNumcompte() {
		return numcompte;
	}

	public void setNumcompte(String numcompte) {
		this.numcompte = numcompte;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getNaissance() {
		return naissance;
	}

	public void setNaissance(LocalDate naissance) {
		this.naissance = naissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getSecurite() {
		return securite;
	}

	public void setSecurite(String securite) {
		this.securite = securite;
	}

	public String getEmailpro() {
		return emailpro;
	}

	public void setEmailpro(String emailpro) {
		this.emailpro = emailpro;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

}
