package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	
	
	public sous_project add(sous_project sp){
		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			PreparedStatement pr=c.prepareStatement("insert into sous_secteur values(?,?,?)");
			pr.setInt(1, sp.getId_sous_project());
			pr.setString(2, sp.getMon_sous_project());
			pr.setInt(3, sp.getId_project());
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sp;
	}
	
	
	public sous_project update(sous_project sp){
		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			PreparedStatement pr=c.prepareStatement("update sous_project set nom_sous_project=?,id_project=? where id_sous_project=?");
			pr.setInt(3, sp.getId_sous_project());
			pr.setString(1, sp.getMon_sous_project());
			pr.setInt(2, sp.getId_project());
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sp;
	}
	
	public sous_project delete(sous_project sp){
		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			PreparedStatement pr=c.prepareStatement("delete from sous_project where id_sous_project=?");
			pr.setInt(1, sp.getId_sous_project());
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return sp;
	}
	
	
	
	
	
}
