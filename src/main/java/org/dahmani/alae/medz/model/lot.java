package org.dahmani.alae.medz.model;

public class lot {

	
	private int id_lot;
	private int superficie;
	private int id_project;
	
	public lot(){
		
	}
	
	
	public lot(int id_lot, int superficie, int id_project) {
		super();
		this.id_lot = id_lot;
		this.superficie = superficie;
		this.id_project = id_project;
	}
	public int getId_lot() {
		return id_lot;
	}
	public void setId_lot(int id_lot) {
		this.id_lot = id_lot;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public int getId_project() {
		return id_project;
	}
	public void setId_project(int id_project) {
		this.id_project = id_project;
	}
	
	
	
	
}
