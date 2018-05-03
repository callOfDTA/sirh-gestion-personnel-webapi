package com.sirh.entite;

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
@Table(name = "collaborateur")
public class Collaborateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "MATRICULE", nullable = false, unique = true)
	private String matricule;

	@Column(name = "NOM", nullable = false)
	private String nom;

	@Column(name = "PRENOM", nullable = false)
	private String prenom;

	@Column(name = "DATE_DE_NAISSANCE", nullable = false)
	private ZonedDateTime dateDeNaissance;

	@Column(name = "ADRESSE", nullable = false)
	private String adresse;

	@Column(name = "SECURITE_SOCIALE", nullable = false)
	private String securiteSociale;

	@Column(name = "EMAIL_PRO", nullable = false)
	private String emailPro;

	@Column(name = "PHOTO", nullable = false)
	private String photo;

	@Column(name = "DATE_HEURE_CREATION", nullable = false)
	private ZonedDateTime dateHeureCreation;

	@Column(name = "NOM_BANQUE", nullable = false)
	private String nomBanque;

	@Column(name = "NUMERO_COMPTE", nullable = false)
	private String numeroCompte;

	@PrePersist
	private void heureDeCreation() {
		dateHeureCreation = ZonedDateTime.now();
	}

	@ManyToOne
	@JoinColumn(name = "DEPARTEMENT_ID", nullable = false)
	private Departement departement;

	public Collaborateur() {

	}

	public Collaborateur(String matricule, String nom, String prenom, ZonedDateTime dateDeNaissance, String adresse,
			String securiteSociale, String emailPro, String photo, ZonedDateTime dateHeureCreation) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.securiteSociale = securiteSociale;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
	}

	public Collaborateur(String matricule, String nom, String prenom, ZonedDateTime dateDeNaissance, String adresse,
			String securiteSociale, String emailPro, String photo, ZonedDateTime dateHeureCreation,
			Departement departement, String nomBanque, String numeroCompte) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.securiteSociale = securiteSociale;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.departement = departement;
		this.nomBanque = nomBanque;
		this.numeroCompte = numeroCompte;
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

	public ZonedDateTime getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(ZonedDateTime dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getSecuriteSociale() {
		return securiteSociale;
	}

	public void setSecuriteSociale(String securiteSociale) {
		this.securiteSociale = securiteSociale;
	}

	public String getEmailPro() {
		return emailPro;
	}

	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public String getNomBanque() {
		return nomBanque;
	}

	public void setNomBanque(String nomBanque) {
		this.nomBanque = nomBanque;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
}
