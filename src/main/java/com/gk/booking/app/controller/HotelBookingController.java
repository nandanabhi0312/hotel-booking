package com.gk.booking.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gk.booking.app.entity.AppInfo;

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

}
