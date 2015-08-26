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

import org.dahmani.alae.medz.model.lot;
import org.dahmani.alae.medz.service.lot_service;

@Path("/lot")
public class lot_data {

	lot_service ls=new lot_service();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<lot> getlots(){
		return ls.getlots();
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public lot add(lot l){
		return ls.add(l);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public lot update(lot l){
		return ls.update(l);
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public lot delete(lot l){
		return ls.delete(l);
	}
	
}
