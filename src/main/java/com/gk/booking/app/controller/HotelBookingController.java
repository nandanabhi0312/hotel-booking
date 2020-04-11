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
	
	@RequestMapping(method = RequestMethod.GET, value = "/info")
	public String getAppInfo() {
		return "This is a hotel booking restful app implemented by Gowrav Krishnamurthy for demo purposes only";
	}

}
