 package org.dahmani.alae.medz.src;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dahmani.alae.medz.model.project;
import org.dahmani.alae.medz.model.secteur;
import org.dahmani.alae.medz.model.secteur_project;
import org.dahmani.alae.medz.service.project_service;
import org.dahmani.alae.medz.service.secteur_project_service;


@Path("/data")
public class data {
	
	project_service projectservice =new project_service();
	secteur_project_service scp=new secteur_project_service();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<project> date(){
		
		return projectservice.getprojects();
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public project add_sect(project p){
		return projectservice.add(p);		
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public project update(project p){
		return projectservice.updateproject(p);
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public project delete(project p){
		return projectservice.deleteproject(p);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
