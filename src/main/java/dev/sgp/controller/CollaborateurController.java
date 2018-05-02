package dev.sgp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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
	private CollaborateurRepository collaRepo;

	@Autowired
	private DepartementRepository departRepo;

	@RequestMapping(method = RequestMethod.GET, path = "/collaborateurs")
	public List<Collaborateur> listerCollaborateur() {

		return collaRepo.findAll();
	}

	@GetMapping(params = { "departement" })
	public List<Collaborateur> getCollaborateurByDepartement(@RequestParam("departement") Integer departementId) {

		return collaRepo.findByDepartements(departRepo.findById(departementId).get());
	}

	@GetMapping("/collaborateurs/{matricule}")
	public Collaborateur getCollaborateurByMatricule(@PathVariable(name = "matricule") String matricule) {

		return collaRepo.findByMatricule(matricule);
	}

	@PutMapping("/collaborateurs/{matricule}")
	public Collaborateur updateCollaborateur(@RequestBody Collaborateur collab,
			@PathVariable(name = "matricule") String matricule) {

		Collaborateur nouveauCollab = collaRepo.findByMatricule(matricule);

		nouveauCollab.setCollab(collab);
		collaRepo.save(nouveauCollab);
		return nouveauCollab;
	}

}
