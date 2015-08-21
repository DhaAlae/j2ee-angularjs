package org.dahmani.alae.medz.service;

import java.sql.Connection;
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
	
	
	
	
	
	
	
	

}
