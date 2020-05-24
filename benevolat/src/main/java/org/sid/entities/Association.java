package org.sid.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Association {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String Login;
	private String mdp;
	private String adresse;
	private String Domaine;
	private Date date_creation;
	private String tel;
	private String fax;
	private String mail;
	
	@JsonIgnore
	@OneToMany(cascade = {CascadeType.ALL},mappedBy = "association")
	private Collection<Donateur> donateurs;
	
	@JsonIgnore
	@OneToMany(cascade = {CascadeType.ALL},mappedBy = "association")
	private Collection<Publication> publications;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDomaine() {
		return Domaine;
	}

	public void setDomaine(String domaine) {
		Domaine = domaine;
	}

	public Date getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Collection<Donateur> getDonateurs() {
		return donateurs;
	}

	public void setDonateurs(Collection<Donateur> donateurs) {
		this.donateurs = donateurs;
	}

	public Collection<Publication> getPublications() {
		return publications;
	}

	public void setPublications(Collection<Publication> publications) {
		this.publications = publications;
	}

	public Association() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Association(Long id, String nom, String login, String mdp, String adresse, String domaine,
			Date date_creation, String tel, String fax, String mail, Collection<Donateur> donateurs,
			Collection<Publication> publications) {
		super();
		this.id = id;
		this.nom = nom;
		Login = login;
		this.mdp = mdp;
		this.adresse = adresse;
		Domaine = domaine;
		this.date_creation = date_creation;
		this.tel = tel;
		this.fax = fax;
		this.mail = mail;
		this.donateurs = donateurs;
		this.publications = publications;
	}
	
	
	
	

}
