package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.dahmani.alae.medz.model.sous_secteur;

public class sous_secteur_service {
	
	
	
	public List<sous_secteur> getsoussecteurs(){
		Connect cc=new Connect();
		Connection c=cc.get();
		List<sous_secteur> list=new ArrayList<>();
		try {
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from sous_secteur");
			while(rs.next()){
				sous_secteur ss=new sous_secteur(rs.getInt(1),rs.getString(2),rs.getInt(3));
				list.add(ss);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
	public sous_secteur update(sous_secteur sect){
		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			PreparedStatement pr=c.prepareStatement("update sous_secteur set nom_secteur=?,id_secteur=? where id_sous_secteur=?");
			pr.setString(1, sect.getNom_sous_secteur());
			pr.setInt(2, sect.getId_secteur());
			pr.setInt(3, sect.getId_sous_secteur());
			pr.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sect;
	}
	
	
	public sous_secteur add(sous_secteur sect){
		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			PreparedStatement pr=c.prepareStatement("insert into sous_secteur values(?,?,?)");
			pr.setString(2, sect.getNom_sous_secteur());
			pr.setInt(3, sect.getId_secteur());
			pr.setInt(1, sect.getId_sous_secteur());
			pr.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sect;
	}
	
	public sous_secteur delete(sous_secteur sect){
		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			PreparedStatement pr=c.prepareStatement("delete from sous_secteur where id_sous_secteur=?");
			pr.setInt(1, sect.getId_sous_secteur());
			pr.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sect;
	}

}
