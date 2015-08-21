package org.dahmani.alae.medz.src;

import java.util.List;

import javax.ws.rs.GET;
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
	
}
