package com.example.main.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.model.Booking;
import com.example.model.Customer;
import com.example.model.Flight;
import com.example.model.Seats;

@Repository
public class AirLineDAO {

	@Autowired
	private JdbcTemplate jdbctemplate;

	private static final String get_Flights = "SELECT * FROM airline.flights";

	private static final String book_Flights_customer = "INSERT INTO airline.customer values(?,?,?,?,?)";

	private static final String book_Flights_flight = "INSERT INTO airline.booking values(?,?,?,?,?,?)";

	private static final String no_Seats = "Select price,totalnoseats,availableseats,bookedseats from airline.flights where flightid=?";

	private static final String cancel_Ticket = "UPDATE airline.booking SET status=? where bookingid=?";

	public void bookTicket(Customer customer, Booking booking) {
		jdbctemplate.update(book_Flights_customer, new Object[] { customer.getAddress(), customer.getAge(),
				customer.getDob(), customer.getMobileno(), customer.getName() });

		jdbctemplate.update(book_Flights_flight, new Object[] { booking.getBookingid(), booking.getFlightid(),
				booking.getStatus(), booking.getMobileno(), booking.getNoofseats(), booking.getTotalprice() });
	}

	public List<List<Flight>> getFlight() {

		List<List<Flight>> list = jdbctemplate.query(get_Flights, new AirlineMapper());

		System.out.println(list.toString() + "WWWWWWWWWW");
		return list;
	}

	public List<Seats> noOfSeats(String flightID) {

		return jdbctemplate.query(no_Seats, new Object[] { flightID }, new RowMapper<Seats>() {

			@Override
			public Seats mapRow(ResultSet rs, int rowNum) throws SQLException {

				Seats seats = new Seats();

				seats.setTotalseats(rs.getInt("totalnoseats"));
				seats.setBookedseats(rs.getInt("availableseats"));
				seats.setAvailableseats(rs.getInt("bookedseats"));
				seats.setPrice(rs.getInt("price"));
				System.out.println(seats + "rrrrtrrrrrrrrrr");
				return seats;
			}
		});
	}

	public int cancelTicket(String bookingid) {
		int updatedvalue = jdbctemplate.update(cancel_Ticket, new Object[] { bookingid, "C" });
		System.out.println(updatedvalue + "updatedvalue");

		return updatedvalue;
	}

}
