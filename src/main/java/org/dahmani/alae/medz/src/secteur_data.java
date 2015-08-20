package org.dahmani.alae.medz.src;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dahmani.alae.medz.model.secteur;
import org.dahmani.alae.medz.service.secteur_service;


@Path("/secteur")
public class secteur_data {

	secteur_service sct=new secteur_service();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<secteur> data(){
		return sct.secteurs();
	}
	
	
	
	
	
	
	
	
}
