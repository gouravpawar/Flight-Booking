package com.flightBookingSystem.airport.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flightBookingSystem.airport.models.Airport;
import com.flightBookingSystem.airport.service.AirportService;


@RestController
@RequestMapping("/airport")
public class AirportController {
	
	
	@Autowired
	private AirportService airportService;
	
	@RequestMapping("/service")
	
	public List<Airport> getAirport() {
		return airportService.getAllAirports();
				
	}
	
	  @RequestMapping(method=RequestMethod.POST, value="/service") 
	
	  public void addAirport(@RequestBody Airport airport ) {
	  airportService.addAirport(airport);
	  }
	 
		
	
	
}
