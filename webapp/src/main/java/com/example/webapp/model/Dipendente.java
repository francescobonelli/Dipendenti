package com.example.webapp.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="dipendenti")
public class Dipendente {

	@jakarta.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cognome")
	private String cognome;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public Date getData_nascita() {
		return data_nascita;
	}

	public void setData_nascita(Date data_nascita) {
		this.data_nascita = data_nascita;
	}

	public Date getData_assunzione() {
		return data_assunzione;
	}

	public void setData_assunzione(Date data_assunzione) {
		this.data_assunzione = data_assunzione;
	}

	public Date getData_fine_rapporto() {
		return data_fine_rapporto;
	}

	public void setData_fine_rapporto(Date data_fine_rapporto) {
		this.data_fine_rapporto = data_fine_rapporto;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}


	@Column(name="data_nascita")
	private Date data_nascita;
	
	@Column(name="sede")
	private String sede;
	
	@Column(name="data_assunzione")
	private Date data_assunzione;
	
	@Column(name="data_fine_rapporto")
	private Date data_fine_rapporto;
	
	
}
