package org.dahmani.alae.medz.src;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dahmani.alae.medz.model.sect;
import org.dahmani.alae.medz.service.sect_service;

@Path("/sct")
public class sect_data {
	
	sect_service s=new sect_service();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<sect> getsect(){
		return s.getsects();
	}
	
	
	
}
