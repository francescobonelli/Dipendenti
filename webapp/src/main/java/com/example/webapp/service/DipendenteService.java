package com.example.webapp.service;

import java.sql.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webapp.model.Dipendente;
import com.example.webapp.repository.DipendentiRepository;

@Service
public class DipendenteService {

	    @Autowired
	    private DipendentiRepository dipendentiRepository;

//	    public Dipendente saveDipendente(Dipendente dipendente) {
//	        return dipendentiRepository.save(dipendente);
//	    }
	    
	    public void addDipendente(String nome,String cognome,Date data_assunzione, Date data_di_nascita, Date data_fine_rapporto,String sede) {
	    	Dipendente dipendente = new Dipendente();
	    	dipendente.setNome(nome);
	    	dipendente.setCognome(cognome);
	    	dipendente.setData_assunzione(data_assunzione);
	    	dipendente.setData_nascita(data_di_nascita);
	    	dipendente.setData_fine_rapporto(data_fine_rapporto);
	    	dipendente.setSede(sede);
	    	dipendentiRepository.save(dipendente);
	    }
	    
	   
	    
	    public void deleteDipendente(long Id)   
	    {  
	    dipendentiRepository.deleteById(Id);  
	    }  
	}

