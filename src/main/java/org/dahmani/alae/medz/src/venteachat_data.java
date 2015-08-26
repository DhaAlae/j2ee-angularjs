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

import org.dahmani.alae.medz.model.vente_achat;
import org.dahmani.alae.medz.service.vente_achat_service;
@Path("/vente_achat")
public class venteachat_data {

	vente_achat_service v=new vente_achat_service();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<vente_achat> getventeachat(){
		return v.venteachat();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public vente_achat add(vente_achat vm ){
		return v.add(vm);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public vente_achat update(vente_achat vm ){
		return v.Update(vm);
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public vente_achat delete(vente_achat vm ){
		return v.add(vm);
	}
}
