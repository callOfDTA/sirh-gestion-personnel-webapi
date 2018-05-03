package com.sirh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirh.entite.Collaborateur;

public interface CollaborateurRepository extends JpaRepository<Collaborateur, Integer> {
	List<Collaborateur> findByDepartementId(Integer departementId);

	Collaborateur findByMatricule(String matricule);
}
