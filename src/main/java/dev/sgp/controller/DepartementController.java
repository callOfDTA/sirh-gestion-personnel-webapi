package dev.sgp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.sgp.entite.Departement;
import dev.sgp.repository.DepartementRepository;

@RestController
@RequestMapping("/api")
public class DepartementController {

	@Autowired
	private DepartementRepository departementRepo;

	@RequestMapping(method = RequestMethod.GET, path = "/departements")
	public List<Departement> listerDepartement() {
		return departementRepo.findAll();
	}
}
