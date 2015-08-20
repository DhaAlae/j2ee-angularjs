package org.dahmani.alae.medz.src;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dahmani.alae.medz.model.sous_project;
import org.dahmani.alae.medz.service.sous_project_service;

@Path("/sous_project")
public class sous_secteur_data {
	
	sous_project_service sr=new sous_project_service();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<sous_project> getsous_secteur(){
		return 	sr.getsoussecteurs();	
	}
	
	
	
	
	
	
	
	
	
	
	
}
