package com.merchandise.consolepack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.merchandise.entities.customer;
import com.merchandise.entities.supplier;
import com.merchandise.services.CustomerService;

public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer")
	public List<customer> getCustomer(){
		return this.customerService.getAllCustomer();
	}
	
	@RequestMapping(value="/customer/{id}")
	public customer getById( int customerId) {
		return this.customerService.getCustomerById(customerId);
	}

}
