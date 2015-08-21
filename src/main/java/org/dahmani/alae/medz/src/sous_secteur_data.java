package org.dahmani.alae.medz.src;

import java.util.List;

import javax.ws.rs.GET;
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
	
	
	
	
	

}
