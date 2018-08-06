package com.example.dao;

import com.example.entity.Customer;
import com.example.entity.FlightTicket;

public interface TicketBookingDAO {
	public String bookTicket(Customer customer, FlightTicket ticket);
}
