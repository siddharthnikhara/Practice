package com.example.main.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.dao.AirLineDAO;
import com.example.main.service.AirlineService;
import com.example.model.Booking;
import com.example.model.BookingCustomer;
import com.example.model.Customer;
import com.example.model.Flight;


@RestController
public class QutarController {

	@Autowired
	private AirlineService airlineservice;
	
	
	@GetMapping(path="/hello")
	public String helloDemo() {
		System.out.println("QQQQQQQQQQ");
		
	return "hello dsfgdisyg";
	}
	
	@GetMapping("/allflights")
	public List<Flight> getFlight(){
	List listallflight=airlineservice.getFlight();
		
		
return listallflight;
		}
	
	
	@PostMapping(path="/bookticket")
	public ResponseEntity<Booking> bookTicket(@RequestBody BookingCustomer bookingcustomer ){
	
		
		System.out.println("QQQQQQQQQQQ");
		airlineservice.bookTicket(bookingcustomer);
		System.out.println();
		
		return null;
	}
	
	@PutMapping(path="/cancelticket{bookingid}")
	public ResponseEntity<Booking> cancelTicket(@PathVariable(value="bookingid") String bookingid){
		
		
		airlineservice.cancelTicket(bookingid);
		
		return null;
		
	}
}
