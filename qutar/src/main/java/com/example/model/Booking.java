package com.example.model;

import java.util.List;

public class Booking {

	private String bookingid;
	private String status;
	private String flightid;
	private String mobileno;
	private int noofseats;
	private int totalprice;
	
	
	
	
	public int getNoofseats() {
		return noofseats;
	}
	public void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getBookingid() {
		return bookingid;
	}
	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}
	
	public Booking(String bookingid, String status, String flightid, String mobileno, int noofseats, int totalprice) {
		super();
		this.bookingid = bookingid;
		this.status = status;
		this.flightid = flightid;
		this.mobileno = mobileno;
		this.noofseats = noofseats;
		this.totalprice = totalprice;
	}
	
	
	
	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", status=" + status + ", flightid=" + flightid + ", mobileno="
				+ mobileno + ", noofseats=" + noofseats + ", totalprice=" + totalprice + "]";
	}
	public Booking() {
		
	}
	
}
