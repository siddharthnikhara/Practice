package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.TicketBookingDAO;
import com.example.entity.Customer;
import com.example.entity.Flight;

@RestController
public class FlightService {

	@Autowired
	private TicketBookingDAO dao;

	@PostMapping("/ticketBook")
	public String bookTicket(@PathVariable Customer customer) {
		String ticket1 = dao.bookTicket(customer);

		return null;
	}

}

//@RequestMapping("/bookFlight")
//public Collection<FlightTicket> bookFlight(Long onewayFlight, Long roundTripFlight, Integer numAdult, Integer numYouth, Integer numChildren) {
//	Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//	
//	Flight flight1 = flightDao.getById(onewayFlight);
//	
//	Flight flight2 = null;
//	if (roundTripFlight!=null) {
//		flight2 = flightDao.getById(roundTripFlight);
//	}
//	
//	Collection<FlightTicket> tickets = new ArrayList<FlightTicket>();
//	
//	FlightTicket flightTicket = new FlightTicket();
//	flightTicket.setUser(authentication.getName());
//	flightTicket.setFlight(flight1.getId());
//	flightTicket.setPrice(flight1.getPrice().multiply(flight1.getPriceFactor()));
//	flightTicket.setSeat("16A");
//	flightTicket.setType(TypePerson.ADULT);
//	tickets.add(flightTicketDao.save(flightTicket));
//	
//	if (flight2!=null){
//		flightTicket = new FlightTicket();
//		flightTicket.setUser(authentication.getName());
//		flightTicket.setFlight(flight2.getId());
//		flightTicket.setPrice(flight2.getPrice().multiply(flight2.getPriceFactor()));
//		flightTicket.setSeat("16A");
//		flightTicket.setType(TypePerson.ADULT);
//		tickets.add(flightTicketDao.save(flightTicket));
//	}
//	
//	return tickets;
//}
//
//@RequestMapping(path = "/printVoucher.pdf", method = RequestMethod.GET, produces = "application/pdf")
//public ResponseEntity<?> print() {
//	
//	PDDocument doc = new PDDocument(); // creating instance of pdfDoc
//	
//    doc.addPage(new PDPage()); // adding page in pdf doc file
//    
//    PDStream ps=new PDStream(doc);
//	
//	try {
//		COSInputStream is = ps.createInputStream();
//
//		return ResponseEntity
//	            .ok()
//	            .contentLength(ps.getLength())
//	            .contentType(
//	                    MediaType.parseMediaType("application/octet-stream"))
//	            .body(new InputStreamResource(is));
//	} catch (IOException e) {
//		return ResponseEntity.badRequest().build();
//	}
//}
//
//}