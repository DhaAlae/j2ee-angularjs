package org.dahmani.alae.medz.src;



import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dahmani.alae.medz.model.client;
import org.dahmani.alae.medz.service.client_service;

@Path("/client")
public class client_data {
	client_service cs=new client_service();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<client> getclient(){
		return cs.getclients();
	}

}
