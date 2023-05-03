package com.merchandise.consolepack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.merchandise.entities.merchandise;
import com.merchandise.services.MerchandiseService;

@RestController
public class MerchandiseController {
	
	@Autowired
	private MerchandiseService merchandiseService;
	
	@PostMapping(value = "/addmerchandise")
	public void addMerchandise(@RequestBody merchandise partner ) {
		merchandiseService.addMerchandise(partner);
		
		
		
	}
	

}
