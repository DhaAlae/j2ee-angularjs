package org.dahmani.alae.medz.service;

import java.sql.Connection;
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
	
	
	
	
	
	
	
	

}
