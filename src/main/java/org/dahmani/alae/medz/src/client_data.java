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
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public client add(client cl){
		return cs.add(cl);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public client update(client cl){
		return cs.update(cl);
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public client delete(client cl){
		return cs.delete(cl);
	}
}
