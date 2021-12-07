package com.flightBookingSystem.FlightBooking.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class FlightBookingcontroller {
	@RequestMapping("/hello")
	public String Hello() {
		return "Hello World For Flight Booking";}
	

}
