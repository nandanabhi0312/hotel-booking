package com.gk.booking.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gk.booking.app.entity.AppInfo;
import com.gk.booking.app.entity.BookingId;


@RequestMapping(value = "/api/booking")
@RestController
public class HotelBookingController {
	
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
		List<BookingId> bookingList = new ArrayList<BookingId>();
		bookingList.add(new BookingId(1));
		bookingList.add(new BookingId(2));
		
		return bookingList;
	}

}
