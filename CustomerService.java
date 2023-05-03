package com.merchandise.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.merchandise.entities.customer;
import com.merchandise.entities.merchandise;
import com.merchandise.entities.supplier;

@Repository
public interface CustomerService {
	
	public void saveCustomerDetails(customer cust);
	
     public List<customer> getAllCustomer();
	
	public customer getCustomerById(int customerid);

}
