package org.dahmani.alae.medz.model;

import java.util.Date;

public class vente_achat {

	private int id_vente_achat;
	private double montant;
	private Date date_aquisition;
	private Date delai_valorisation;
	private double prix_unitaire;
	private String zone_franche;
	private int investissement;
	private String mon_commercial;
	private int nombre_employe;
	private String activite_economique;
	private String sous_secteur;
	private String sous_project;
	
	public vente_achat(){
		
	}

	public vente_achat(int id_vente_achat, double montant,
			Date date_aquisition, Date delai_valorisation,
			double prix_unitaire, String zone_franche, int investissement,
			String mon_commercial, int nombre_employe,
			String activite_economique, String sous_secteur, String sous_project) {
		super();
		this.id_vente_achat = id_vente_achat;
		this.montant = montant;
		this.date_aquisition = date_aquisition;
		this.delai_valorisation = delai_valorisation;
		this.prix_unitaire = prix_unitaire;
		this.zone_franche = zone_franche;
		this.investissement = investissement;
		this.mon_commercial = mon_commercial;
		this.nombre_employe = nombre_employe;
		this.activite_economique = activite_economique;
		this.sous_secteur = sous_secteur;
		this.sous_project = sous_project;
	}

	public int getId_vente_achat() {
		return id_vente_achat;
	}

	public void setId_vente_achat(int id_vente_achat) {
		this.id_vente_achat = id_vente_achat;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Date getDate_aquisition() {
		return date_aquisition;
	}

	public void setDate_aquisition(Date date_aquisition) {
		this.date_aquisition = date_aquisition;
	}

	public Date getDelai_valorisation() {
		return delai_valorisation;
	}

	public void setDelai_valorisation(Date delai_valorisation) {
		this.delai_valorisation = delai_valorisation;
	}

	public double getPrix_unitaire() {
		return prix_unitaire;
	}

	public void setPrix_unitaire(double prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}

	public String getZone_franche() {
		return zone_franche;
	}

	public void setZone_franche(String zone_franche) {
		this.zone_franche = zone_franche;
	}

	public int getInvestissement() {
		return investissement;
	}

	public void setInvestissement(int investissement) {
		this.investissement = investissement;
	}

	public String getMon_commercial() {
		return mon_commercial;
	}

	public void setMon_commercial(String mon_commercial) {
		this.mon_commercial = mon_commercial;
	}

	public int getNombre_employe() {
		return nombre_employe;
	}

	public void setNombre_employe(int nombre_employe) {
		this.nombre_employe = nombre_employe;
	}

	public String getActivite_economique() {
		return activite_economique;
	}

	public void setActivite_economique(String activite_economique) {
		this.activite_economique = activite_economique;
	}

	public String getSous_secteur() {
		return sous_secteur;
	}

	public void setSous_secteur(String sous_secteur) {
		this.sous_secteur = sous_secteur;
	}

	public String getSous_project() {
		return sous_project;
	}

	public void setSous_project(String sous_project) {
		this.sous_project = sous_project;
	}
	
}
