package dev.controller;

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

import dev.entite.Collaborateur;
import dev.repository.CollaborateurRepository;

@RestController
@RequestMapping("/collaborateurs")
public class CollaborateurApiController {

	@Autowired
	private CollaborateurRepository collaborateurRepo;

	@GetMapping
	public List<Collaborateur> listerCollaborateur() {
		return this.collaborateurRepo.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, params = { "departement" })
	@ResponseBody // parser l'objet Client
	public List<Collaborateur> findCollaborateur(@RequestParam("departement") int departementId) {
		return collaborateurRepo.findByDepartementId(departementId);
	}

	@RequestMapping(value = "/{matricule}", method = RequestMethod.GET)
	@ResponseBody // parser l'objet Client
	public Collaborateur findCollaborateurbymatricule(@PathVariable String matricule) {
		return collaborateurRepo.findByMatricule(matricule);
	}

	@RequestMapping(value = "/{matricule}", method = RequestMethod.PUT)
	@ResponseBody // parser l'objet Client
	public Collaborateur changeCollaborateurbymatricule(@PathVariable String matricule,
			@RequestBody Collaborateur newcollab) {
		Collaborateur collab = collaborateurRepo.findByMatricule(matricule);
		collab.setNom(newcollab.getNom());
		collab.setAdresse(newcollab.getAdresse());
		collab.setDateHeureCreation(newcollab.getDateHeureCreation());
		collab.setEmailpro(newcollab.getEmailpro());
		collab.setMatricule(newcollab.getMatricule());
		collab.setNaissance(newcollab.getNaissance());
		collab.setPhoto(newcollab.getPhoto());
		collab.setPrenom(newcollab.getPrenom());
		collab.setSecurite(newcollab.getSecurite());
		collaborateurRepo.save(collab);
		return collab;
	}

	@RequestMapping(value = "/{matricule}/banque", method = RequestMethod.GET)
	@ResponseBody // parser l'objet Client
	public String findbanquebymatricule(@PathVariable String matricule) {
		Collaborateur collab = collaborateurRepo.findByMatricule(matricule);
		return "banque : " + collab.getNombanque() + " numero compte : " + collab.getNumcompte();
	}

	@RequestMapping(value = "/{matricule}/banque", method = RequestMethod.PUT)
	@ResponseBody // parser l'objet Client
	public String changebanquebymatricule(@PathVariable String matricule, @RequestBody Collaborateur newcollab) {
		Collaborateur collab = collaborateurRepo.findByMatricule(matricule);
		collab.setNombanque(newcollab.getNombanque());
		collab.setNumcompte(newcollab.getNumcompte());
		collaborateurRepo.save(collab);
		return "banque : " + collab.getNombanque() + " numero compte : " + collab.getNumcompte();
	}
}
