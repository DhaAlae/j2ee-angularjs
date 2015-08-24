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

import org.dahmani.alae.medz.model.dirigent;
import org.dahmani.alae.medz.service.dirigent_service;


@Path("/dirigent")
public class dirigent_data {
        dirigent_service d=new dirigent_service();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<dirigent> getdirigent(){
		return d.getdirigent();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public dirigent add(dirigent dr){
		return d.add(dr);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public dirigent update(dirigent dr){
		return d.update(dr);
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public dirigent delete(dirigent dr){
		return d.delete(dr);
	}
	
}
