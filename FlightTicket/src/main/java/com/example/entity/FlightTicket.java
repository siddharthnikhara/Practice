package com.example.entity;

import java.io.Serializable;


public class FlightTicket implements Serializable {
    private long id;
	private long flight;
	private String seat;
	private double price;
	
	public FlightTicket() {
		// TODO Auto-generated constructor stub
	}

	public FlightTicket(long id, long flight, String seat, double price) {
		super();
		this.id = id;
		this.flight = flight;
		this.seat = seat;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getFlight() {
		return flight;
	}

	public void setFlight(long flight) {
		this.flight = flight;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FlightTicket [id=" + id + ", flight=" + flight + ", seat=" + seat + ", price=" + price + "]";
	}
	

}
