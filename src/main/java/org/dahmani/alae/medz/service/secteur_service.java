package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import org.dahmani.alae.medz.model.secteur;


public class secteur_service {
	
	
	public List<secteur> secteurs(){
		
		Connect cc=new Connect();
		Connection c=cc.get();
        List<secteur> list=new ArrayList<>();
		try {
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from secteur");
			while(rs.next()){
				secteur s1=new secteur(rs.getInt(1),rs.getString(2),rs.getInt(3));
				list.add(s1);	
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;	
	}
	
	

	public secteur add_secteur(secteur sect){
		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			PreparedStatement pr=c.prepareStatement("insert into secteur(id_secteur,nom_secteur,id_project) values(?,?,?)");
			pr.setInt(1, sect.getId_secteur());
			pr.setString(2, sect.getNom_secteur());
			pr.setInt(3, sect.getId_project());
			pr.executeUpdate();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sect;
	}
	
	
	public secteur update_secteur(secteur sect){
		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			PreparedStatement pr=c.prepareStatement("update secteur set nom_secteur=?,id_project=? where id_secteur=?");
			pr.setInt(3, sect.getId_secteur());
			pr.setString(1, sect.getNom_secteur());
			pr.setInt(2, sect.getId_project());
			pr.executeUpdate();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sect;
	}
	
	
	public secteur delete_secteur(secteur sect){
		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			PreparedStatement pr=c.prepareStatement("delete from secteur where id_secteur=?");
			pr.setInt(1, sect.getId_secteur());
			pr.executeUpdate();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sect;
	}
	
	
	
	

}
