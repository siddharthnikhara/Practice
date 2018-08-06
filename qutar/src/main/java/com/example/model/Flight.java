package com.example.model;

public class Flight {
	
	private String flightid;
	private String flightname;
	private String origin;
	private String departure;
	private int price;
	private int totalnoseats;
	private int availableseats;
	private int bookedseats;
 
	public int getBookedseats() {
		return bookedseats;
	}
	public void setBookedseats(int bookedseats) {
		this.bookedseats = bookedseats;
	}


private String arrival;
	private String destination;
	
	
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotalnoseats() {
		return totalnoseats;
	}
	public void setTotalnoseats(int totalnoseats) {
		this.totalnoseats = totalnoseats;
	}
	public int getAvailableseats() {
		return availableseats;
	}
	public void setAvailableseats(int availableseats) {
		this.availableseats = availableseats;
	}

	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Flight [flightid=" + flightid + ", flightname=" + flightname + ", origin=" + origin + ", departure="
				+ departure + ", price=" + price + ", totalnoseats=" + totalnoseats + ", availableseats="
				+ availableseats + ", bookedseats=" + bookedseats + ", arrival=" + arrival + ", destination="
				+ destination + "]";
	}
	public Flight(String flightid, String flightname, String origin, String departure, int price, int totalnoseats,
			int availableseats, int bookedseats, String arrival, String destination) {
		super();
		this.flightid = flightid;
		this.flightname = flightname;
		this.origin = origin;
		this.departure = departure;
		this.price = price;
		this.totalnoseats = totalnoseats;
		this.availableseats = availableseats;
		this.bookedseats = bookedseats;
		this.arrival = arrival;
		this.destination = destination;
	}
	public Flight() {
		
	}
	

}
