package com.sirh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sirh.entite.Collaborateur;
import com.sirh.repository.CollaborateurRepository;

@RestController
@RequestMapping("/collaborateurs")
public class CollaborateurApiControlleur {
	@Autowired
	private CollaborateurRepository collabRepo;

	@GetMapping
	public List<Collaborateur> listeCollaborateur() {
		return this.collabRepo.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, params = { "departement" })
	@ResponseBody
	public List<Collaborateur> collabParDepartement(@RequestParam("departement") int departementId) {
		return collabRepo.findByDepartementId(departementId);
	}

	@RequestMapping(value = "/{matricule}", method = RequestMethod.GET)
	@ResponseBody
	public Collaborateur collabParMatricule(@PathVariable("matricule") String matricule) {
		return collabRepo.findByMatricule(matricule);
	}

	@RequestMapping(value = "/{matricule}", method = RequestMethod.PUT)
	@ResponseBody
	public Collaborateur modifCollab(@PathVariable("matricule") String matricule,
			@RequestBody Collaborateur newCollab) {
		Collaborateur collab = collabRepo.findByMatricule(matricule);
		collab.setAdresse(newCollab.getAdresse());
		collab.setPrenom(newCollab.getPrenom());
		collab.setNom(newCollab.getNom());
		collabRepo.save(collab);
		return collab;
	}

	@RequestMapping(value = "/{matricule}/banque", method = RequestMethod.GET)
	@ResponseBody
	public String recupBanque(@PathVariable String matricule) {
		Collaborateur collab = collabRepo.findByMatricule(matricule);
		return "Banque: " + collab.getNomBanque() + ", Numero de compte : " + collab.getNumeroCompte();
	}

	@RequestMapping(value = "/{matricule}/banque", method = RequestMethod.PUT)
	@ResponseBody
	public String modifBanque(@PathVariable("matricule") String matricule, @RequestBody Collaborateur newCollab) {
		Collaborateur collab = collabRepo.findByMatricule(matricule);
		collab.setNomBanque(newCollab.getNomBanque());
		collab.setNumeroCompte(newCollab.getNumeroCompte());
		collabRepo.save(collab);
		return "Banque: " + collab.getNomBanque() + ", Numero de compte : " + collab.getNumeroCompte();
	}

}
