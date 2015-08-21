package org.dahmani.alae.medz.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class client {
	
	
	private int id_client;
	private int id_parent;
	private String nom_client;
	private String raison_social;
	private String email;
	private String tel;
	private int chiffre_affaire;
	private String fax;
	private int rc_appartenance;
	private String pays_origin;
	private String ville;
	private String logo;
	private String site_web;
	private int adress_postal;
	private int nombre_employe;
	
	
	public client(){
		
	}


	public client(int id_client, int id_parent, String nom_client,
			String raison_social, String email, String tel,
			int chiffre_affaire, String fax, int rc_appartenance,
			String pays_origin, String ville, String logo, String site_web,
			int adress_postal, int nombre_employe) {
		super();
		this.id_client = id_client;
		this.id_parent = id_parent;
		this.nom_client = nom_client;
		this.raison_social = raison_social;
		this.email = email;
		this.tel = tel;
		this.chiffre_affaire = chiffre_affaire;
		this.fax = fax;
		this.rc_appartenance = rc_appartenance;
		this.pays_origin = pays_origin;
		this.ville = ville;
		this.logo = logo;
		this.site_web = site_web;
		this.adress_postal = adress_postal;
		this.nombre_employe = nombre_employe;
	}


	public int getId_client() {
		return id_client;
	}


	public void setId_client(int id_client) {
		this.id_client = id_client;
	}


	public int getId_parent() {
		return id_parent;
	}


	public void setId_parent(int id_parent) {
		this.id_parent = id_parent;
	}


	public String getNom_client() {
		return nom_client;
	}


	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}


	public String getRaison_social() {
		return raison_social;
	}


	public void setRaison_social(String raison_social) {
		this.raison_social = raison_social;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public int getChiffre_affaire() {
		return chiffre_affaire;
	}


	public void setChiffre_affaire(int chiffre_affaire) {
		this.chiffre_affaire = chiffre_affaire;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public int getRc_appartenance() {
		return rc_appartenance;
	}


	public void setRc_appartenance(int rc_appartenance) {
		this.rc_appartenance = rc_appartenance;
	}


	public String getPays_origin() {
		return pays_origin;
	}


	public void setPays_origin(String pays_origin) {
		this.pays_origin = pays_origin;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getLogo() {
		return logo;
	}


	public void setLogo(String logo) {
		this.logo = logo;
	}


	public String getSite_web() {
		return site_web;
	}


	public void setSite_web(String site_web) {
		this.site_web = site_web;
	}


	public int getAdress_postal() {
		return adress_postal;
	}


	public void setAdress_postal(int adress_postal) {
		this.adress_postal = adress_postal;
	}


	public int getNombre_employe() {
		return nombre_employe;
	}


	public void setNombre_employe(int nombre_employe) {
		this.nombre_employe = nombre_employe;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
