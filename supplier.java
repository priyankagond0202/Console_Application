package com.merchandise.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name="supplier")
public class supplier {
	
	@Id
	private int supplierId;
	private int creditBalance;
	private int licenseNumber;
	
	@ManyToOne
    private merchandise merchandise ;
	 
	
	
	public supplier(int supplierId, int creditBalance, int licenseNumber,
			com.merchandise.entities.merchandise merchandise) {
		super();
		this.supplierId = supplierId;
		this.creditBalance = creditBalance;
		this.licenseNumber = licenseNumber;
		this.merchandise = merchandise;
	}
	
	public supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getCreditBalance() {
		return creditBalance;
	}
	public void setCreditBalance(int creditBalance) {
		this.creditBalance = creditBalance;
	}
	public int getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	@Override
	public String toString() {
		return "supplier [supplierId=" + supplierId + ", creditBalance=" + creditBalance + ", licenseNumber="
				+ licenseNumber + ", merchandise=" + merchandise + "]";
	}
	

}
