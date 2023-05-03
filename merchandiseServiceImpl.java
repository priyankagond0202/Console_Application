package com.merchandise.servicesImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.merchandise.dataConnection.DataConnection;
import com.merchandise.entities.merchandise;
import com.merchandise.services.MerchandiseService;

public class merchandiseServiceImpl implements MerchandiseService{
	
	Connection connection;
	
	public merchandiseServiceImpl() throws SQLException {
		connection = DataConnection.getConnection() ;
	}

	@Override
	public void addMerchandise(merchandise partner) {
		long partner_id = partner.getId() ;
		String partner_name = partner.getName();
		String city = partner.getCity();
		String state= partner.getState();
		
		
       String insertQuery = "INSERT INTO merchandise data VALUES("+partner_id+",'"+partner_name+"','"+city+"','"+state+"'";
       
       try {
       PreparedStatement stmt = connection.prepareStatement(insertQuery);
       stmt.executeQuery();
       System.out.println("Data added");
       
       }catch(SQLException e) {
    	   e.printStackTrace();
       }
		
	}

	@Override
	public List<merchandise> getAllMerchandise() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public merchandise getMerchandiserById(int merchandiseid) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
