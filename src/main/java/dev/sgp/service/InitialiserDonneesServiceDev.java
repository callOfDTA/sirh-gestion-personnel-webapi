package dev.sgp.service;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;

@Service
public class InitialiserDonneesServiceDev implements InitialiserDonneesService {
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public void initialiser() {

		Departement depart1 = new Departement("Informatique", true);
		Departement depart2 = new Departement("Marketing", true);

		Collaborateur collab1 = new Collaborateur("Vernay", "Alexis", LocalDate.now(), "210 Cours de la Libération",
				"16554546", depart1);
		Collaborateur collab2 = new Collaborateur("Vernay", "Julien", LocalDate.now(), "10 Rue Edith Piaf", "4564654",
				depart2);

		em.persist(depart1);
		em.persist(depart2);
		em.persist(collab1);
		em.persist(collab2);
	}
}