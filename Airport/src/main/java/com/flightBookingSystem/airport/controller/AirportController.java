package com.flightBookingSystem.airport.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airport")
public class AirportController {
	
	@GetMapping("/hello")
	
	public Object hello() {
		return "Hello World For Airport";
	}
}
