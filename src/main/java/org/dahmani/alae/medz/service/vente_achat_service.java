package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.dahmani.alae.medz.model.vente_achat;

public class vente_achat_service {

	
	public List<vente_achat> venteachat(){
		
		List<vente_achat> list=new ArrayList<>();
		

		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from vente_achat");
			while(rs.next()){
				vente_achat v=new vente_achat(rs.getInt(1), rs.getDouble(2), rs.getDate(3), rs.getDate(4), rs.getDouble(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getInt(10), rs.getInt(11));
				list.add(v);
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
