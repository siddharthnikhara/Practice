package com.example.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.entity.Customer;
import com.example.entity.Flight;
import com.example.entity.FlightTicket;

@Repository
public class TicketBookingDAOImpl implements TicketBookingDAO {
	private static final String save_Ticket = "INSERT INTO FLIGHT VALUES(?,?,?,?,?,?,?,?)";

	private JdbcTemplate template;

	@Override
	public String bookTicket(Customer customer, FlightTicket ticket) {
		int ticket1 = template.update(save_Ticket, customer.getFirstName(), customer.getLastName(),
				customer.getIdProof(), customer.getNationality(), ticket.getId(), ticket.getFlight(), ticket.getSeat(),
				ticket.getPrice());
		return null;
	}

}
