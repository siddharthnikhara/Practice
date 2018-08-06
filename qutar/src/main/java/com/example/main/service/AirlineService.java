package com.example.main.service;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrlTemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.dao.AirLineDAO;
import com.example.model.Booking;
import com.example.model.BookingCustomer;
import com.example.model.Customer;
import com.example.model.Flight;
import com.example.model.Seats;

@Service
public class AirlineService {

	
	@Autowired
	private AirLineDAO airlinedao;
	
      public void bookTicket(BookingCustomer bookingcustomer) {
		
    	  
    	  Customer customer=new Customer();
    	  Booking booking=new Booking();
    	   int mobileno=Integer.parseInt(bookingcustomer.getMobileno());
    	             System.out.println(mobileno+" "+"mobile");
    	            int z=mobileno+(int) Math.round(Math.random()*10000);
    	         String bookingid=String.valueOf(z);
    			System.out.println(z+""+"z");
    			
//    			Booking booking=new Booking();
//    			booking.setBookingid(bookingid);
    			
    			customer.setAddress(bookingcustomer.getAddress());
    			customer.setAge(bookingcustomer.getAge());
    			customer.setName(bookingcustomer.getName());
    			customer.setMobileno(bookingcustomer.getMobileno());
    			customer.setDob(bookingcustomer.getDob());
    			
    			booking.setBookingid(bookingid);
    			booking.setStatus("B");
    			booking.setFlightid(bookingcustomer.getFlightid());
    			List<Seats> list=airlinedao.noOfSeats(bookingcustomer.getFlightid());
    			System.out.println(list+"YYYYYYYYYYYYYYYYYYYYYY");
    			for(Seats seat: list) {
    				int totalseats=	seat.getTotalseats();
    	    		int availableseats=seat.getAvailableseats();	
    	    		int bookedseats=seat.getBookedseats();
    			    int price=seat.getPrice();
//    			    int totalprice=0;
//    			    int nofseats_booking=0;
    			    System.out.println(price+"price");
    	    		if(bookedseats<totalseats) {
    	    			int nofseats_booking=bookingcustomer.getNoofseats();
    	    			bookedseats+=nofseats_booking;
    	    			availableseats=availableseats-nofseats_booking;
    	    		int totalprice=price*nofseats_booking;
    	    		booking.setTotalprice(totalprice);	
    	    		System.out.println(totalprice+"totalprice");
    	    		System.out.println(bookedseats+"bookedseats");
    	    		booking.setNoofseats(nofseats_booking);
    	    		if(nofseats_booking>=6) {
    	    		int discount=totalprice*25/100;
    	    		totalprice=totalprice-discount;
    	    		booking.setTotalprice(totalprice);
    	    		booking.setNoofseats(nofseats_booking);
    	    		System.out.println(totalprice+"totalprice");
    	    		}
    	    		}
    			}
    	booking.setMobileno(bookingcustomer.getMobileno());
    			airlinedao.bookTicket(customer,booking);
    			
    		   }
	
      public List<List<Flight>> getFlight() {
		return airlinedao.getFlight();
      }
      
      
      public void cancelTicket(String bookingid) {
		airlinedao.cancelTicket(bookingid);
	}
}
