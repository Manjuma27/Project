package com.Project.project.Model;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {
	
	@Id
	private int phone;
	
	@Column(name="name")
	private String name;
	
	@Column(name="product")
	private  String product;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="address")
	private String address;

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
