package org.dahmani.alae.medz.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class project {
	
	private int id_project;
	private String nom_project;

	public project(){
		
	}
	
	public project(int id_project, String nom_project) {
		super();
		this.id_project = id_project;
		this.nom_project = nom_project;

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
