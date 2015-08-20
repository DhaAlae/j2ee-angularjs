package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.dahmani.alae.medz.model.project;

import com.google.gson.JsonArray;
import com.google.gson.JsonPrimitive;

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public project getproject(int id){
		project p1=new project();
		try {
			
		Statement st=c.createStatement();
		ResultSet rs=st.executeQuery("select * from project where id_project="+id);
		rs.next();
			p1.setId_project(rs.getInt(1));
			p1.setNom_project(rs.getString(2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return p1;
	}
	
	public void deleteproject(int id){
		
		Statement st;
		try {
			st = c.createStatement();
		    st.executeUpdate("delete from project where id_project="+id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void updateproject(project p){
		
		Statement st;
		try {
			st = c.createStatement();
		  st.executeUpdate("update project set mon_project="+p.getNom_project()+" where id_project="+p.getId_project());
		        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
