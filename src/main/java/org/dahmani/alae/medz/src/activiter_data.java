package org.dahmani.alae.medz.src;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dahmani.alae.medz.model.activiter;
import org.dahmani.alae.medz.service.activiter_service;

@Path("/activiter")
public class activiter_data {

	activiter_service a=new activiter_service();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<activiter> getactivite(){
		return a.getactiviter();
	}
	
	
	
	
}
