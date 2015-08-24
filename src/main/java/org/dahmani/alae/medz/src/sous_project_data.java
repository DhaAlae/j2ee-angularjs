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

import org.dahmani.alae.medz.model.sous_project;
import org.dahmani.alae.medz.service.sous_project_service;

@Path("/sous_project")
public class sous_project_data {
	
	sous_project_service sr=new sous_project_service();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<sous_project> getsous_secteur(){
		return 	sr.getsousprojects();	
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public sous_project add(sous_project sp){
		return sr.add(sp);
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public sous_project update(sous_project sp){
		return sr.update(sp);
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public sous_project delete(sous_project sp){
		return sr.delete(sp);
	}
	
}
