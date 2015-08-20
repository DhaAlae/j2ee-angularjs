package org.dahmani.alae.medz.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class sous_project {
	
	
	private int id_sous_project;
	private String mon_sous_project;
	private int id_project;
	
	
	public sous_project(){
		
	}
	
	
	
	public sous_project(int id_sous_project, String mon_sous_project,
			int id_project) {
		super();
		this.id_sous_project = id_sous_project;
		this.mon_sous_project = mon_sous_project;
		this.id_project = id_project;
	}



	public int getId_sous_project() {
		return id_sous_project;
	}



	public void setId_sous_project(int id_sous_project) {
		this.id_sous_project = id_sous_project;
	}



	public String getMon_sous_project() {
		return mon_sous_project;
	}



	public void setMon_sous_project(String mon_sous_project) {
		this.mon_sous_project = mon_sous_project;
	}



	public int getId_project() {
		return id_project;
	}



	public void setId_project(int id_project) {
		this.id_project = id_project;
	}
	
	
	
	
	
	
	

}
