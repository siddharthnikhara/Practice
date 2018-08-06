package com.example.main.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.Flight;
import com.example.model.Seats;

public class AirlineMapper implements RowMapper<List<Flight>> {

	@Override
	public List<Flight> mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		List list=new ArrayList<>();
	Flight flight=new Flight();
	flight.setFlightid(rs.getString("flightid"));
	flight.setFlightname(rs.getString("flightname"));
	flight.setArrival(rs.getString("arrival"));
	flight.setAvailableseats(rs.getInt("availableseats"));
	flight.setDeparture(rs.getString("departure"));
	flight.setDestination(rs.getString("destination"));
	flight.setOrigin(rs.getString("origin"));
	flight.setPrice(rs.getInt("price"));
	flight.setTotalnoseats(rs.getInt("totalnoseats"));
		list.add(flight);

	return list;
	}
	
	
}
