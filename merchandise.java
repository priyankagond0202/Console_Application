package com.merchandise.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import java.util.ArrayList;


@Entity
@Table(name="merchandise")
public class merchandise {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="partner_id")
	private long id ; 
	
	@Column(name="partner_name", nullable = false)
	private String name ; 
	
	@Column(name="city")
	private String city;

	@Column(name ="state")
	private String state;
	
	@OneToMany(mappedBy = "merchandise",cascade = CascadeType.ALL)
	private List<customer> cust =new ArrayList<>();
	
	@OneToMany(mappedBy = "merchandise",cascade = CascadeType.ALL)
	private List<supplier> supp =new ArrayList<>();
	
	
	

	
	public merchandise(long id, String name, String city, String state) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
	}
	

	public merchandise() {
		super();
		// TODO Auto-generated constructor stub
	}
      

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "merchandise [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", cust=" + cust
				+ ", supp=" + supp + "]";
	}
	
}
