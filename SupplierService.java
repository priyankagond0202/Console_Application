package com.merchandise.services;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.stereotype.Repository;

import com.merchandise.entities.customer;
import com.merchandise.entities.merchandise;
import com.merchandise.entities.supplier;

@Repository
public interface SupplierService {
	
	public void saveSupplierDetails(Supplier supplier);
	
    public List<supplier> getAllSupplier();
	
	public supplier getSupplierById(int supplierid);
	
	

}
