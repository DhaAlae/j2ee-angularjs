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

import org.dahmani.alae.medz.model.sous_secteur;
import org.dahmani.alae.medz.service.sous_secteur_service;
@Path("/sous_secteur")
public class sous_secteur_data {
	
	sous_secteur_service ss=new sous_secteur_service();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<sous_secteur> getsoussecteur(){
		return ss.getsoussecteurs();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public sous_secteur add(sous_secteur sect){
		return ss.add(sect);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public sous_secteur update(sous_secteur sect){
		return ss.update(sect);
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public sous_secteur delete(sous_secteur sect){
		return ss.delete(sect);
	}

}
