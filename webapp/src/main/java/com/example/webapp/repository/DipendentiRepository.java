package com.example.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webapp.model.Dipendente;

public interface DipendentiRepository extends JpaRepository <Dipendente,Long>{

}
