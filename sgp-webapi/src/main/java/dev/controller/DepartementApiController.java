package dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entite.Departement;
import dev.repository.DepartementRepository;

@RestController
@RequestMapping("/departements")
public class DepartementApiController {

	@Autowired
	private DepartementRepository departementRepo;

	@GetMapping
	public List<Departement> listerdepartement() {
		return this.departementRepo.findAll();
	}

}
