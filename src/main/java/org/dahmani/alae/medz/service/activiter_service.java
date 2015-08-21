package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.dahmani.alae.medz.model.activiter;


public class activiter_service {
	
	public List<activiter> getactiviter(){
		
		List<activiter> list=new ArrayList<>();
		Connect cc=new Connect();
		Connection c=cc.get();
		
		try {
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from activiter_economique");
			while(rs.next()){
				activiter l=new activiter(rs.getInt(1),rs.getString(2),rs.getInt(3));
				list.add(l);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return list;
		
		
		
		
		
	}
	
	
	
	
	

}
