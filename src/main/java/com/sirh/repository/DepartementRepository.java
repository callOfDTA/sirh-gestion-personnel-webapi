package com.sirh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirh.entite.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {

}
