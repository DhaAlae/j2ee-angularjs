package org.dahmani.alae.medz.model;



public class vente_achat {

	private int id_vente_achat;
	private int montant;
	private String date_aquisition;
	private String delai_valorisation;
	private int prix_unitaire;
	private String zone_franche;
	private int investissement;
	private String mon_commercial;
	private int nombre_employe;
	private int id_lot;
	private int id_client;
	
	public vente_achat(){
		
	}

	public vente_achat(int id_vente_achat, int montant,
			String date_aquisition, String delai_valorisation,
			int prix_unitaire, String zone_franche, int investissement,
			String mon_commercial, int nombre_employe,
			 int id_lot, int id_client) {
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
		this.id_lot = id_lot;
		this.id_client = id_client;
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

	

	public double getPrix_unitaire() {
		return prix_unitaire;
	}

	public String getDate_aquisition() {
		return date_aquisition;
	}

	public void setDate_aquisition(String date_aquisition) {
		this.date_aquisition = date_aquisition;
	}

	public String getDelai_valorisation() {
		return delai_valorisation;
	}

	public void setDelai_valorisation(String delai_valorisation) {
		this.delai_valorisation = delai_valorisation;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public void setPrix_unitaire(int prix_unitaire) {
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

	public int getId_lot() {
		return id_lot;
	}

	public void setId_lot(int id_lot) {
		this.id_lot = id_lot;
	}

	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}


	
}
