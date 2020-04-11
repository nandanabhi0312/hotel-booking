package com.gk.booking.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelBookingController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/booking/ping")
	public String getAppStatus() {
		return "Available";
	}

}
