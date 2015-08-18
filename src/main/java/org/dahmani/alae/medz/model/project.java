package org.dahmani.alae.medz.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class project {
	
	private int id_project;
	private String nom_project;
	private ArrayList secteur=new ArrayList();
	private ArrayList sect_selec=new ArrayList(); 
	
	public ArrayList getSect_selec() {
		return sect_selec;
	}

	public void setSect_selec(ArrayList sect_selec) {
		this.sect_selec = sect_selec;
	}

	public ArrayList getSecteur() {
		return secteur;
	}

	public void setSecteur(ArrayList secteur) {
		this.secteur = secteur;
	}

	public project(){
		
	}
	
	public project(int id_project, String nom_project,ArrayList secteur,ArrayList sect) {
		super();
		this.id_project = id_project;
		this.nom_project = nom_project;
		this.secteur = secteur;
		this.sect_selec=sect;
	}

	public int getId_project() {
		return id_project;
	}

	public void setId_project(int id_project) {
		this.id_project = id_project;
	}

	public String getNom_project() {
		return nom_project;
	}

	public void setNom_project(String nom_project) {
		this.nom_project = nom_project;
	}


	
	
	
	
	
	
	
	
	

}
