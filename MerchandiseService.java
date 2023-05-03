package com.merchandise.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.merchandise.entities.customer;
import com.merchandise.entities.merchandise;

@Repository
public interface MerchandiseService {
	
	public void addMerchandise(merchandise partner);
	
	public List<merchandise> getAllMerchandise();
	
	public merchandise getMerchandiserById(int merchandiseid);
	

}
