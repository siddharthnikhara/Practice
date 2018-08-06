package com.example.entity;

import java.io.Serializable;
import java.util.Date;


public class Flight implements Serializable {
	private long id;
	private Date date;
	private long origin;
	private long destination;
	private double price;
	private int availableSeats;

	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public Flight(long id, Date date, long origin, long destination, double price, int availableSeats) {
		super();
		this.id = id;
		this.date = date;
		this.origin = origin;
		this.destination = destination;
		this.price = price;
		this.availableSeats = availableSeats;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getOrigin() {
		return origin;
	}

	public void setOrigin(long origin) {
		this.origin = origin;
	}

	public long getDestination() {
		return destination;
	}

	public void setDestination(long destination) {
		this.destination = destination;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", date=" + date + ", origin=" + origin + ", destination=" + destination
				+ ", price=" + price + ", availableSeats=" + availableSeats + "]";
	}

}
