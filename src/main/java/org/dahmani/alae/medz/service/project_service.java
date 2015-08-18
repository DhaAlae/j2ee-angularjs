package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.dahmani.alae.medz.model.project;

public class project_service {
		Connect cc=new Connect();
  // methode to get all project 
	public List<project> getprojects() {
		List<project> list=new ArrayList<>();
		Connection c=cc.get();
		ArrayList ttsecteur=new ArrayList();
		ArrayList sect=new ArrayList();
		try {
			
			PreparedStatement pr=c.prepareStatement("select nom_secteur from secteur");
			ResultSet rr=pr.executeQuery();
			while(rr.next()){
				ttsecteur.add(rr.getString(1));
			}
			
			
			Statement stt=c.createStatement();
			
			
			
			
			
			
			
			
			
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from project");
			while(rs.next()){
				
				ResultSet rss=stt.executeQuery("select nom_secteur from secteur where id_project="+rs.getInt(1));
				while(rss.next()){
					sect.add(rss.getString(1));
				}
				
				project p1=new project(rs.getInt(1),rs.getString(2),ttsecteur,sect);
				
				list.add(p1);
				
			}
			
			
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	

	
}
