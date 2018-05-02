package dev.sgp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.sgp.entite.Collaborateur;
import dev.sgp.repository.CollaborateurRepository;
import dev.sgp.repository.DepartementRepository;

@RestController
@RequestMapping("/api")
public class CollaborateurController {

	@Autowired
	private CollaborateurRepository collabRepo;

	@Autowired
	private DepartementRepository departementRepo;

	@RequestMapping(method = RequestMethod.GET, path = "/collaborateurs")
	public List<Collaborateur> getCollaborateurs() {
		return collabRepo.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/collaborateurs", params = "departement")
	public List<Collaborateur> getCollaborateursByDepartement(@RequestParam("departement") Integer departementId) {

		return collabRepo.findByDepartement(departementRepo.findById(departementId).get());
	}

	@RequestMapping(method = RequestMethod.GET, path = "/collaborateurs/{matricule}")
	public Collaborateur getCollaborateurByMatricule(@PathVariable String matricule) {
		return collabRepo.findByMatricule(matricule);
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/collaborateurs/{matricule}")
	public Collaborateur putCollaborateurByMatricule(@RequestBody Collaborateur collaborateur,
			@PathVariable String matricule) {

		Collaborateur collab = collabRepo.findByMatricule(matricule);
		collab.setCollaborateur(collaborateur);
		collabRepo.save(collab);
		return collab;
	}

}
