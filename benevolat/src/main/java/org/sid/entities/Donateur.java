package org.sid.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Donateur {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_donateur;
	private String nom;
	private String login;
	private String mdp;
	private String tel;
	private String mail;
	private String adresse;
	
	@ManyToOne
	private Association association;
	
	@JsonIgnore
	@OneToMany(cascade = {CascadeType.ALL},mappedBy = "donateur")
	private Collection<Publication> publications;

	public Long getId_donateur() {
		return id_donateur;
	}

	public void setId_donateur(Long id_donateur) {
		this.id_donateur = id_donateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Association getAssociation() {
		return association;
	}

	public void setAssociation(Association association) {
		this.association = association;
	}

	public Collection<Publication> getPublications() {
		return publications;
	}

	public void setPublications(Collection<Publication> publications) {
		this.publications = publications;
	}

	public Donateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Donateur(Long id_donateur, String nom, String login, String mdp, String tel, String mail, String adresse,
			 Association association, Collection<Publication> publications) {
		super();
		this.id_donateur = id_donateur;
		this.nom = nom;
		this.login = login;
		this.mdp = mdp;
		this.tel = tel;
		this.mail = mail;
		this.adresse = adresse;
		this.association = association;
		this.publications = publications;
	}
	
	
	

}
