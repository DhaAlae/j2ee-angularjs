package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.dahmani.alae.medz.model.sect;

public class sect_service {

	
	Connect cc=new Connect();
	Connection c=cc.get();
	
	public List<sect> getsects(){
		List<sect> list=new ArrayList<>();
		
		try {
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from secteur");
			while(rs.next()){
				sect s=new sect(rs.getInt(1), rs.getString(2));
				list.add(s);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
