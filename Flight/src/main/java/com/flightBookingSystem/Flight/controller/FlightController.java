package com.flightBookingSystem.Flight.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flights")
public class FlightController {
	
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World for Flight";
	}

}
