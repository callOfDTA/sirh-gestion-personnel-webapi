package dev.sgp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;

public interface CollaborateurRepository extends JpaRepository<Collaborateur, Integer> {

	List<Collaborateur> findByDepartements(Departement departement);

	Collaborateur findByMatricule(String matricule);
}
