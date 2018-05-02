package dev.service;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dev.entite.Collaborateur;
import dev.entite.Departement;

@Service
public class InitialiserDonneesServiceDev implements InitialiserDonneesService {
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public void initialiser() {

		Departement depart1 = new Departement("Informatique", true);
		Departement depart2 = new Departement("Marketing", true);
		Collaborateur collab1 = new Collaborateur("OSS117", "Vernay", "Alexis", LocalDate.now(),
				"210 Cours de la Libération", "16554546", "alexis.vernay@free.fr", "image.jpg", ZonedDateTime.now(),
				depart1, "BPBA", "COMPTE1");
		Collaborateur collab2 = new Collaborateur("S117", "Vernay", "Julien", LocalDate.now(), "10 Rue Edith Piaf",
				"4564654", "julien.vernay@free.fr", "image.jpg", ZonedDateTime.now(), depart2, "CA", "COMPTE2");
		em.persist(depart1);
		em.persist(depart2);
		em.persist(collab1);
		em.persist(collab2);
	}
}