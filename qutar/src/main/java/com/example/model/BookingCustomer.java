package com.example.model;

import java.util.Date;

public class BookingCustomer {
	
	private String name;
	private String age;
	private String dob;
	private String address;
	private String flightid;
	private String mobileno;
	private int noofseats;
	
	
	
	
	public int getNoofseats() {
		return noofseats;
	}
	public void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}
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
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	

	
	
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "BookingCustomer [name=" + name + ", age=" + age + ", dob=" + dob + ", address=" + address
				+ ", flightid=" + flightid + ", mobileno=" + mobileno + ", noofseats=" + noofseats + "]";
	}
	public BookingCustomer(String name, String age, String dob, String address, String flightid, String mobileno,
			int noofseats) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.address = address;
		this.flightid = flightid;
		this.mobileno = mobileno;
		this.noofseats = noofseats;
	}
	public BookingCustomer() {
		
	}
	
}
