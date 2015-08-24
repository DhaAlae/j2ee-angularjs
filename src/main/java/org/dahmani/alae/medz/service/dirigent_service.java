package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	
	public dirigent add(dirigent d){
		Connect cc=new Connect();
		Connection c=cc.get();
		
		try {
			PreparedStatement pr=c.prepareStatement("insert into dirigent values(?,?,?,?,?,?,?,?,?)");
			pr.setInt(1, d.getId_dirigent());
			pr.setString(2, d.getNon_dirigent());
			pr.setString(3, d.getPrenom_dirigent());
			pr.setString(4, d.getQuality_dirigent());
			pr.setString(5, d.getFonction());
			pr.setString(6, d.getTel());
			pr.setString(7, d.getFax());
			pr.setString(8, d.getEmail());
			pr.setInt(9, d.getId_client());
			pr.executeUpdate();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}
	
	
	public dirigent update(dirigent d){
		Connect cc=new Connect();
		Connection c=cc.get();
		
		try {
			PreparedStatement pr=c.prepareStatement("update dirigent set nom_dirigent=?,prenom_dirigent=?,quality_dirigent=?,fonction_dirigent=?,tel=?,fax=?,email=?,id_client? where id_dirigent=?");
			pr.setInt(9, d.getId_dirigent());
			pr.setString(1, d.getNon_dirigent());
			pr.setString(2, d.getPrenom_dirigent());
			pr.setString(3, d.getQuality_dirigent());
			pr.setString(4, d.getFonction());
			pr.setString(5, d.getTel());
			pr.setString(6, d.getFax());
			pr.setString(7, d.getEmail());
			pr.setInt(8, d.getId_client());
			pr.executeUpdate();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}
	
	public dirigent delete(dirigent d){
		Connect cc=new Connect();
		Connection c=cc.get();
		
		try {
			PreparedStatement pr=c.prepareStatement("delete from dirigent where id_dirient=?");
			pr.setInt(1, d.getId_dirigent());
			pr.executeUpdate();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}
}
