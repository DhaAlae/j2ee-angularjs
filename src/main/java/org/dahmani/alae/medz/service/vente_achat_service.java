package org.dahmani.alae.medz.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.dahmani.alae.medz.model.vente_achat;

public class vente_achat_service {

	
	public List<vente_achat> venteachat(){
		List<vente_achat> list=new ArrayList<>();
		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from vente_achat");
			while(rs.next()){
				vente_achat v=new vente_achat(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getInt(10), rs.getInt(11));
				list.add(v);
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return list;
	}
	
	public vente_achat add(vente_achat v){
		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			PreparedStatement pr = c.prepareStatement("insert into vente achat values(?,?,to_date('DD/MM/YYYY',?),to_date('DD/MM/YYYY',?),?,?,?,?,?,?,?)");
			pr.setInt(1, v.getId_vente_achat());
			pr.setInt(2, (int) v.getMontant());
			pr.setString(3, v.getDate_aquisition());
			pr.setString(4, v.getDelai_valorisation());
			pr.setInt(5, (int) v.getPrix_unitaire());
			pr.setString(6, v.getZone_franche());
			pr.setInt(7, v.getInvestissement());
			pr.setString(8, v.getMon_commercial());
			pr.setInt(9, v.getNombre_employe());
			pr.setInt(10, v.getId_lot());
			pr.setInt(11, v.getId_client());
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v;
	}
	
	
	public vente_achat Update(vente_achat v){
		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			PreparedStatement pr = c.prepareStatement("update vente_achat set montant=?,date_aquisition=to_date('DD/MM/YYYY',?),date_valorisation=to_date('DD/MM/YYYY',?),prix_unitaire=?,zone_franch=?,ivestissement=?,nom_commercial=?,nombre_employe=?,id_lot=?,id_client=? where id_vente_achat=?");
			pr.setInt(11, v.getId_vente_achat());
			pr.setInt(1, (int) v.getMontant());
			pr.setString(2, v.getDate_aquisition());
			pr.setString(3, v.getDelai_valorisation());
			pr.setInt(4, (int) v.getPrix_unitaire());
			pr.setString(5, v.getZone_franche());
			pr.setInt(6, v.getInvestissement());
			pr.setString(7, v.getMon_commercial());
			pr.setInt(8, v.getNombre_employe());
			pr.setInt(9, v.getId_lot());
			pr.setInt(10, v.getId_client());
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v;
	}
	
	
	
	public vente_achat delete(vente_achat v){
		Connect cc=new Connect();
		Connection c=cc.get();
		try {
			PreparedStatement pr = c.prepareStatement("delete from vente_achat where id_vente_achat=?");
			pr.setInt(1, v.getId_vente_achat());			
			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
