package org.dahmani.alae.medz.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class secteur_project {

	private int secteur;
	private int project;
	
	public secteur_project(){
		
	}

	public secteur_project(int secteur, int project) {
		super();
		this.secteur = secteur;
		this.project = project;
	}

	public int getSecteur() {
		return secteur;
	}

	public void setSecteur(int secteur) {
		this.secteur = secteur;
	}

	public int getProject() {
		return project;
	}

	public void setProject(int project) {
		this.project = project;
	}
	
	
	
	
	
	
	
}
