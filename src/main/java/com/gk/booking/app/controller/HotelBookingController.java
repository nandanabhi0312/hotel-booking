package com.gk.booking.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api/booking")
@RestController
public class HotelBookingController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/ping")
	public String getAppStatus() {
		return "Available";
	}

}
