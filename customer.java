package com.merchandise.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name ="customer")
public class customer {
	
	@Id
	private int customerId;
    public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	private int creditLimit;
    private int PhoneNumber;
    private String email;
    
	@ManyToOne 
    private merchandise merchandise;
    
    
	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", creditLimit=" + creditLimit + ", PhoneNumber=" + PhoneNumber
				+ ", email=" + email + ", merchandise=" + merchandise + "]";
	}


	public customer(int creditLimit, int phoneNumber, String email) {
		super();
		this.creditLimit = creditLimit;
		PhoneNumber = phoneNumber;
		this.email = email;
	}
	

	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int string) {
		this.creditLimit = string;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
