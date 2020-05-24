package org.sid.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Publication {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pub;
	private Date date_pub;
	private String content;
	private boolean etat;
	private String type;
	private int evaluation;
	@ManyToOne
	private Association association;
	
	
	@ManyToOne
	private Donateur donateur;

	
	
	
	public Publication() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Publication(Long id_pub, Date date_pub, String content, boolean etat, String type, int evaluation,
			Association association, Donateur donateur) {
		super();
		this.id_pub = id_pub;
		this.date_pub = date_pub;
		this.content = content;
		this.etat = etat;
		this.type = type;
		this.evaluation = evaluation;
		this.association = association;
		this.donateur = donateur;
	}



	public int getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(int evaluation) {
		this.evaluation = evaluation;
	}

	public Long getId_pub() {
		return id_pub;
	}

	public void setId_pub(Long id_pub) {
		this.id_pub = id_pub;
	}

	public Date getDate_pub() {
		return date_pub;
	}

	public void setDate_pub(Date date_pub) {
		this.date_pub = date_pub;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Association getAssociation() {
		return association;
	}

	public void setAssociation(Association association) {
		this.association = association;
	}

	public Donateur getDonateur() {
		return donateur;
	}

	public void setDonateur(Donateur donateur) {
		this.donateur = donateur;
	}

	
	

}
