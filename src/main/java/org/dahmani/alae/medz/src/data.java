 package org.dahmani.alae.medz.src;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dahmani.alae.medz.model.project;
import org.dahmani.alae.medz.service.project_service;


@Path("/data")
public class data {
	
	project_service projectservice =new project_service();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<project> date(){
		
		return projectservice.getprojects();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
