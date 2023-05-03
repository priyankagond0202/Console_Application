package com.merchandise.servicesImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import com.merchandise.dataConnection.DataConnection;
import com.merchandise.entities.customer;
import com.merchandise.entities.merchandise;
import com.merchandise.entities.supplier;
import com.merchandise.services.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	static List<customer> custList = new ArrayList();
   
	Connection connection;
	
	public CustomerServiceImpl() throws SQLException {
		connection = DataConnection.getConnection() ;
	}

	@Override
	public void saveCustomerDetails(customer cust) {
		
		int customerId = cust.getCustomerId();
		int credit_limit = cust.getCreditLimit();
		int phone_number = cust.getPhoneNumber();
		String email = cust.getEmail();
		
		
       String insertQuery = "INSERT INTO merchandise data VALUES("+customerId+","+credit_limit+""+phone_number+",'"+email+"'";
       
       try {
       PreparedStatement stmt = connection.prepareStatement(insertQuery);
       stmt.executeQuery();
       System.out.println("Data added");
       
       }catch(SQLException e) {
    	   e.printStackTrace();
       }

}

	@Override
	public List<customer>getAllCustomer()  {
		
		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT* FROM EMPLOYEE_DATA");
			 ResultSet rs = stmt.executeQuery();
			 
			 while(rs.next()) {
				customer cust = new customer(); 
				cust.setCustomerId(rs.getShort(1));
				cust.setCreditLimit(rs.getString(2));
				cust.setPhoneNumber(rs.getInt(3));
				cust.setEmail(rs.getString(4));
				custList.add(cust);
			 }
		}catch(SQLException e){
			e.printStackTrace();
		}
		return custList;
	}

	
	@Override
	public customer getCustomerById(int customerid) {
		// TODO Auto-generated method stub
		customer cust = customer.stream().filter(t -> id.contentEquals(t.getId())).findFirst().orElse(null);
		return cust;
	}
}
