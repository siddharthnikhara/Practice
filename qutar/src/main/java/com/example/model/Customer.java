package com.example.model;

import java.util.Date;

public class Customer {

	
	private String name;
	private String age;
	private String dob;
	private String address;
	private String mobileno;
	
	
	
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String string) {
		this.dob = string;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", dob=" + dob + ", address=" + address + "]";
	}
	
	public Customer(String name, String age, String dob, String address, String mobileno) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.address = address;
		this.mobileno = mobileno;
	}
	public Customer() {
		
	}
	
	
	
}
