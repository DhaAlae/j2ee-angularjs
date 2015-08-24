package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.dahmani.alae.medz.model.project;

public class project_service {
		Connect cc=new Connect();
		Connection c=cc.get();
  // methode to get all project 
	public List<project> getprojects() {
		List<project> list=new ArrayList<>();
		
		try {

			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from project");
			//project p1=new project();
			while(rs.next()){
				
				project p1=new project(rs.getInt(1),rs.getString(2));
				list.add(p1);	
				
				}
			
	
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				}
				return list;
					}
	
	
	
	public project deleteproject(project p){
		
		try {
			PreparedStatement pr=c.prepareStatement("detele from project where id_project=?");
			pr.setInt(1, p.getId_project());
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   return p;	
	}
	
	
	public project updateproject(project p){
		
		try {
			PreparedStatement pr=c.prepareStatement("update project set nom_project=? where id_project=?");
			pr.setInt(2, p.getId_project());
			pr.setString(1, p.getNom_project());
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	  return p;
	}
	
	public project add(project p){
		
		try {
			PreparedStatement pr=c.prepareStatement("insert into project values(?,?)");
			pr.setInt(1, p.getId_project());
			pr.setString(2, p.getNom_project());
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return p;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
