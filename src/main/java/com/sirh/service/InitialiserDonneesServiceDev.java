package com.sirh.service;

import java.time.ZonedDateTime;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sirh.entite.Collaborateur;
import com.sirh.entite.Departement;

@Service
public class InitialiserDonneesServiceDev implements InitialiserDonneesService {
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public void initialiser() {

		Departement depart1 = new Departement("Informatique", true);
		Departement depart2 = new Departement("Marketing", true);
		Collaborateur collab1 = new Collaborateur("OSS117", "Vernay", "Alexis", ZonedDateTime.now(),
				"210 Cours de la Libération", "16554546", "alexis.vernay@free.fr", "image.jpg", ZonedDateTime.now(),
				depart1, "Société Générale", "KG5456S42S");
		Collaborateur collab2 = new Collaborateur("S117", "Vernay", "Julien", ZonedDateTime.now(), "10 Rue Edith Piaf",
				"4564654", "julien.vernay@free.fr", "image.jpg", ZonedDateTime.now(), depart2, "Crédit Lyonnais",
				"O2G136S5G421");
		em.persist(depart1);
		em.persist(depart2);
		em.persist(collab1);
		em.persist(collab2);
	}
}
