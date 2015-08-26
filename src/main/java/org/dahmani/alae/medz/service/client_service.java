package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.dahmani.alae.medz.model.client;

public class client_service {

	public List<client> getclients(){
		
		List<client> list=new ArrayList<>();
		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from client");
			while(rs.next()){
				client cl=new client(rs.getInt(1), rs.getInt(15), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getInt(13), rs.getInt(14));
				list.add(cl);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
	public client add(client cl){
		Connect cc=new Connect();
		Connection c=cc.get();
	    try {
			PreparedStatement pr=c.prepareStatement("insert into client values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pr.setInt(1, cl.getId_client());
			pr.setString(2, cl.getNom_client());
			pr.setString(3, cl.getRaison_social());
			pr.setString(4, cl.getEmail());
			pr.setString(5, cl.getTel());
			pr.setInt(6, cl.getChiffre_affaire());
			pr.setString(7, cl.getFax());
			pr.setInt(8, cl.getRc_appartenance());
			pr.setString(9, cl.getPays_origin());
			pr.setString(10, cl.getVille());
			pr.setString(11, cl.getLogo());
			pr.setString(12, cl.getSite_web());
			pr.setInt(13, cl.getAdress_postal());
			pr.setInt(14, cl.getNombre_employe());
			pr.setInt(15, cl.getId_parent());
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cl;
	}
	
	public client update(client cl){
		Connect cc=new Connect();
		Connection c=cc.get();
	    try {
			PreparedStatement pr=c.prepareStatement("update client set nom_client=?,raison_social=?,email=?,tel=?,chiffre_affaire=?,fax=?,rc_appartenance=?,pays_origin=?,ville=?,logo=?,site_web=?,adress_postal=?,nombre_employe=?,id_parent=? where id_client=?");
			pr.setInt(15, cl.getId_client());
			pr.setString(1, cl.getNom_client());
			pr.setString(2, cl.getRaison_social());
			pr.setString(3, cl.getEmail());
			pr.setString(4, cl.getTel());
			pr.setInt(5, cl.getChiffre_affaire());
			pr.setString(6, cl.getFax());
			pr.setInt(7, cl.getRc_appartenance());
			pr.setString(8, cl.getPays_origin());
			pr.setString(9, cl.getVille());
			pr.setString(10, cl.getLogo());
			pr.setString(11, cl.getSite_web());
			pr.setInt(12, cl.getAdress_postal());
			pr.setInt(13, cl.getNombre_employe());
			pr.setInt(14, cl.getId_parent());
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cl;
	}
	
	public client delete(client cl){
		Connect cc=new Connect();
		Connection c=cc.get();
	    try {
			PreparedStatement pr=c.prepareStatement("delete from client where id_client=?");
			pr.setInt(1, cl.getId_client());
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cl;
	}
	
}
