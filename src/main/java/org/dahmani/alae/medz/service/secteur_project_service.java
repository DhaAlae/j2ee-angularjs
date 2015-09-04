package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.dahmani.alae.medz.model.secteur_project;

public class secteur_project_service {
	Connect cc=new Connect();
	Connection c=cc.get();
	
	public List<secteur_project> getdata(){
		List<secteur_project> list=new ArrayList<>();
		
		
		
		
		return list;
	}
	
	public secteur_project add(secteur_project p){
		
	   PreparedStatement pr;
	try {
		pr = c.prepareStatement("insert into secteur_project values(?,?)");
	    pr.setInt(1, p.getProject());
	    pr.setInt(1, p.getSecteur());
	   pr.executeUpdate();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return  p;
	}
	
	
	
	
}
