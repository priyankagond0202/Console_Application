package com.merchandise.consolepack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.merchandise.entities.customer;
import com.merchandise.entities.supplier;
import com.merchandise.services.CustomerService;
import com.merchandise.services.SupplierService;

public class SupplierController {
	@Autowired
	private SupplierService supplierService;
	

	
	@GetMapping("/supplier")
	public List<supplier> getSupplier(){
		return this.supplierService.getAllSupplier();
	}
	
	@RequestMapping(value="/supplier/{id}")
	public supplier getSupplierById( int supplierId) {
		return supplierService.getSupplierById(supplierId);
	}

}
