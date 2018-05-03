package com.sirh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sirh.entite.Departement;
import com.sirh.repository.DepartementRepository;

@RestController
@RequestMapping("/departements")
public class DepartementApiController {
	@Autowired
	private DepartementRepository departRepo;

	@GetMapping
	public List<Departement> listeDepartement() {
		return this.departRepo.findAll();
	}
}
