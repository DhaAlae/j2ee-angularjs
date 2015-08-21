package org.dahmani.alae.medz.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class activiter {
	
	private int id_activite;
	private String nom_activite;
	private int id_sous_secteur;
	
	public activiter(){
		
	}

	public activiter(int id_activite, String nom_activite, int id_sous_secteur) {
		super();
		this.id_activite = id_activite;
		this.nom_activite = nom_activite;
		this.id_sous_secteur = id_sous_secteur;
	}

	public int getId_activite() {
		return id_activite;
	}

	public void setId_activite(int id_activite) {
		this.id_activite = id_activite;
	}

	public String getNom_activite() {
		return nom_activite;
	}

	public void setNom_activite(String nom_activite) {
		this.nom_activite = nom_activite;
	}

	public int getId_sous_secteur() {
		return id_sous_secteur;
	}

	public void setId_sous_secteur(int id_sous_secteur) {
		this.id_sous_secteur = id_sous_secteur;
	}
	
	
	
	
	
	

}
