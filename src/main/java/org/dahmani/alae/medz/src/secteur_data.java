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
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public secteur add_sect(secteur sect){
		return sct.add_secteur(sect);
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public secteur update(secteur sect){
		return sct.update_secteur(sect);
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public secteur delete(secteur sect){
		return sct.delete_secteur(sect);
	}
	
	
	
}
