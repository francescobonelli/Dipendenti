package com.example.webapp.controller;



import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.webapp.model.Dipendente;
import com.example.webapp.repository.DateRepository;
import com.example.webapp.repository.DipendentiRepository;
import com.example.webapp.service.DipendenteService;

@Controller
@RequestMapping("/")
public class IndexController{
	@Autowired
	private DipendentiRepository dipendentiRepository;
	@Autowired
	private DipendenteService dipendenteService;
//	
	private final DateRepository dateRepository;
	public IndexController(DateRepository dateRepository, DipendenteService dipendenteService) {
		this.dateRepository = dateRepository;
		this.dipendenteService=dipendenteService;

	}
	


	 @GetMapping("/")
	    public String index(Model model) {
//		 
	        List<Dipendente> dipendenti = dipendentiRepository.findAll();
	        model.addAttribute("dipendenti", dipendenti);
//	        
//	       
	        List<LocalDate> data_fine_rapporto = dateRepository.getDate();
	        model.addAttribute("data_fine_rapporto",data_fine_rapporto);
	        return "index";
	    }
	 
	 @PostMapping("/addDipendente")
    	 public String addDipendente(
	            @RequestParam String firstName,
	            @RequestParam String lastName,
	            @RequestParam java.sql.Date startDate,
	            @RequestParam(required = false) java.sql.Date endDate,
	            @RequestParam java.sql.Date birthDate,
	            @RequestParam String role) {
	       
	        dipendenteService.addDipendente(firstName, lastName, startDate, endDate, birthDate, role);
	      
	        return "redirect:/";
	    }
	
	  
	 @PostMapping("/delete/{id}")
	    public String deleteDipendente(@PathVariable Long id) {
		 System.out.println("Deleting ID: " + id);
	        dipendentiRepository.deleteById(id);
	        return "redirect:/";
	    }

	@GetMapping("/hello")
	public String hello(@RequestParam(name="name",required=false,defaultValue="World")String name,Model model) {
		model.addAttribute("name",name);
		return "hello";
	}

	@GetMapping("/user")
	public String user(@RequestParam(name="name",required=false,defaultValue="World")String name,Model model) {
		model.addAttribute("name",name);
		return "user";
	}
}

