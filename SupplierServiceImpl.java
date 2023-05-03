package com.merchandise.servicesImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;

import com.merchandise.dataConnection.DataConnection;
import com.merchandise.entities.customer;
import com.merchandise.entities.merchandise;
import com.merchandise.entities.supplier;
import com.merchandise.services.SupplierService;

public class SupplierServiceImpl implements SupplierService{
	
	@Autowired
	static List<supplier> suppList = new ArrayList();
	
    Connection connection;
	
	public SupplierServiceImpl() throws SQLException {
		connection = DataConnection.getConnection() ;
	}
	

	@Override
	public void saveSupplierDetails(Supplier supplier) {
	
		int supplierId = supplier.getid();
	    int credit_balance= supplier.getcredit_balance();
	    int lisence_number = supplier.getlisence_number();
		
		
       String insertQuery = "INSERT INTO merchandise data VALUES("+supplierId+","+ credit_balance+","+ lisence_number+"";
       
       try {
       PreparedStatement stmt = connection.prepareStatement(insertQuery);
       stmt.executeQuery();
       System.out.println("Data added");
       
       }catch(SQLException e) {
    	   e.printStackTrace();
       }

     }
	

	@Override
	public List<supplier> getAllSupplier() {
		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT* FROM EMPLOYEE_DATA");
			 ResultSet rs = stmt.executeQuery();
			 
			 while(rs.next()) {
				supplier supp = new supplier(); 
				supp.setCreditBalance(rs.getInt(1));
				supp.setSupplierId(rs.getInt(2));
				supp.setLicenseNumber(rs.getInt(3));
				suppList.add(supp);
			 }
		}catch(SQLException e){
			e.printStackTrace();
		}
	      
		return suppList;
	}

	
	@Override
	public supplier getSupplierById(int supplierid) {
		supplier supp = supplier.stream().filter(t -> id.contentEquals(t.getId())).findFirst().orElse(null);
		return supp;
	}
}
