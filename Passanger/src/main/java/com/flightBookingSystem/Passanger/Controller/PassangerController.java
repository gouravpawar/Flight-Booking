package com.flightBookingSystem.Passanger.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passanger")
public class PassangerController {
	@RequestMapping("/hello")
	public String Hello() {
		return "Hello World For Passanger";
	}

}
