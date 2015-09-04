package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.dahmani.alae.medz.model.project;
import org.dahmani.alae.medz.model.secteur;

public class secteur_service {
	Connect cc=new Connect();
	Connection c=cc.get();
	
//	public List<secteur> getsecteurs() {
//		List<secteur> list=new ArrayList<>();
//		
//		try {
//
//			Statement st=c.createStatement();
//			ResultSet rs=st.executeQuery("select * from secteur");
//			//project p1=new project();
//			while(rs.next()){
//				secteur p1=new secteur(rs.getInt(0),rs.getString(1));
//				list.add(p1);	
//				
//				}
//			
//	
//			} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//				}
//				return list;
//					}
	
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
	
	
	
	
	
	
	
	

}
