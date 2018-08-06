package com.example.model;

public class Seats {

	
	private int totalseats;
	private int availableseats;
	private int bookedseats;
	private int price;
	
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotalseats() {
		return totalseats;
	}
	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}
	public int getAvailableseats() {
		return availableseats;
	}
	public void setAvailableseats(int availableseats) {
		this.availableseats = availableseats;
	}
	public int getBookedseats() {
		return bookedseats;
	}
	public void setBookedseats(int bookedseats) {
		this.bookedseats = bookedseats;
	}

	@Override
	public String toString() {
		return "Seats [totalseats=" + totalseats + ", availableseats=" + availableseats + ", bookedseats=" + bookedseats
				+ ", price=" + price + "]";
	}
	
	
	public Seats(int totalseats, int availableseats, int bookedseats, int price) {
		super();
		this.totalseats = totalseats;
		this.availableseats = availableseats;
		this.bookedseats = bookedseats;
		this.price = price;
	}
	public Seats() {
		
	}
	
}
