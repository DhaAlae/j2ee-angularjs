package org.dahmani.alae.medz.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class sous_secteur {

	private int id_sous_secteur;
	private String nom_sous_secteur;
	private int id_secteur;
	
	public sous_secteur(){
		
	}

	public sous_secteur(int id_sous_secteur, String nom_sous_secteur,
			int id_secteur) {
		super();
		this.id_sous_secteur = id_sous_secteur;
		this.nom_sous_secteur = nom_sous_secteur;
		this.id_secteur = id_secteur;
	}

	public int getId_sous_secteur() {
		return id_sous_secteur;
	}

	public void setId_sous_secteur(int id_sous_secteur) {
		this.id_sous_secteur = id_sous_secteur;
	}

	public String getNom_sous_secteur() {
		return nom_sous_secteur;
	}

	public void setNom_sous_secteur(String nom_sous_secteur) {
		this.nom_sous_secteur = nom_sous_secteur;
	}

	public int getId_secteur() {
		return id_secteur;
	}

	public void setId_secteur(int id_secteur) {
		this.id_secteur = id_secteur;
	}
	
	
	
	
	
	
	
	
	
	
}
