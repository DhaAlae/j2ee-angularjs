package org.dahmani.alae.medz.model;

public class dirigent {
	
	private int id_dirigent;
	private String non_dirigent;
	private String prenom_dirigent;
	private String quality_dirigent;
	private String fonction;
	private String tel;
	private String fax;
	private String email;
	private int id_client;
	
	
	public dirigent(){
		
	}
	
	
	public dirigent(int id_dirigent, String non_dirigent,
			String prenom_dirigent, String quality_dirigent, String fonction,
			String tel, String fax, String email, int id_client) {
		super();
		this.id_dirigent = id_dirigent;
		this.non_dirigent = non_dirigent;
		this.prenom_dirigent = prenom_dirigent;
		this.quality_dirigent = quality_dirigent;
		this.fonction = fonction;
		this.tel = tel;
		this.fax = fax;
		this.email = email;
		this.id_client = id_client;
	}
	public int getId_dirigent() {
		return id_dirigent;
	}
	public void setId_dirigent(int id_dirigent) {
		this.id_dirigent = id_dirigent;
	}
	public String getNon_dirigent() {
		return non_dirigent;
	}
	public void setNon_dirigent(String non_dirigent) {
		this.non_dirigent = non_dirigent;
	}
	public String getPrenom_dirigent() {
		return prenom_dirigent;
	}
	public void setPrenom_dirigent(String prenom_dirigent) {
		this.prenom_dirigent = prenom_dirigent;
	}
	public String getQuality_dirigent() {
		return quality_dirigent;
	}
	public void setQuality_dirigent(String quality_dirigent) {
		this.quality_dirigent = quality_dirigent;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId_client() {
		return id_client;
	}
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
	
	

}
