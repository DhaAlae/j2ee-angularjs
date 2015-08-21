package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.dahmani.alae.medz.model.lot;

public class lot_service {

	
	
	public List<lot> getlots(){
		List<lot> list=new ArrayList<>();
		Connect cc=new Connect();
		Connection c=cc.get();
		
		try {
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from lot");
			while(rs.next()){
				lot l=new lot(rs.getInt(1),rs.getInt(2),rs.getInt(3));
				list.add(l);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return list;
	}
	
	
	
	
	
	
}
