package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.dahmani.alae.medz.model.dirigent;

public class dirigent_service {

	public List<dirigent> getdirigent(){
		
		List<dirigent> list=new ArrayList<>();
		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from dirigent");
			while(rs.next()){
				dirigent d=new dirigent(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9));
				list.add(d);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return list;
	}
	
	
	
	
	
	
	
}
