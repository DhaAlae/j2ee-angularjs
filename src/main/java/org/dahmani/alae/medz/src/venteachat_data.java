package org.dahmani.alae.medz.src;

import java.util.List;

import javax.ws.rs.GET;
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
	
	
	
	
}
