package com.gk.booking.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gk.booking.app.entity.AppInfo;
import com.gk.booking.app.entity.Booking;
import com.gk.booking.app.entity.BookingId;
import com.gk.booking.app.entity.CreateBooking;
import com.gk.booking.app.service.HotelBookingService;


@RequestMapping(value = "/api/booking")
@RestController
public class HotelBookingController {
	
	@Autowired
	private HotelBookingService service;
	
	@RequestMapping(method = RequestMethod.GET, value = "/ping")
	public String getAppStatus() {
		return "Available";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/info")
	public AppInfo getAppInfo() {
		
		AppInfo appInfo = new AppInfo();
		appInfo.setAuthor("Gowrav Krishnamurthy");
		appInfo.setInfo("This is a hotel booking Demo app");
		return appInfo;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "")
	public List<BookingId> getBookings() {
		return service.getBookings();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Booking getBooking(@PathVariable Integer id) {
		return service.getBooking(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "")
	public @ResponseBody CreateBooking createBooking(@RequestBody Booking pBooking) {
		return service.createBooking(pBooking);
	}

	@RequestMapping(method = RequestMethod.PATCH, value = "/{id}")
	public @ResponseBody Booking updateBooking(@PathVariable Integer id, @RequestBody Booking pBooking) {
		return service.updateBooking(id, pBooking);
	}
}
