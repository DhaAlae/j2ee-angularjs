package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.dahmani.alae.medz.model.sous_project;




public class sous_project_service {

	public List<sous_project> getsousprojects(){
		
		List<sous_project> list = new ArrayList<>();
		
		Connect cc=new Connect();
		Connection c=cc.get();
		
		Statement st;
		try {
			st = c.createStatement();
		    ResultSet rs=st.executeQuery("select * from sous_project");
		    while(rs.next()){
		    	sous_project sp=new sous_project(rs.getInt(1),rs.getString(2),rs.getInt(3));
		    	list.add(sp);
		    	
		    }
		    
		    
		    
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
	
	
	
	
	
}
