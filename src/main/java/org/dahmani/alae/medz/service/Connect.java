package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	
	
	public Connection get(){
		Connection c=null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            c=DriverManager.getConnection(url,"medz","ntic");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return c;
	}
	
	
	

}
