package com.gk.booking.app.init;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.gk.booking.app.entity.Booking;
import com.gk.booking.app.entity.BookingDates;
import com.gk.booking.app.entity.CreateBooking;
import com.gk.booking.app.service.HotelBookingService;

@Component
public class SetupInitialData {
	
	@Autowired
	private HotelBookingService service;
	
	@Bean(initMethod = "setup")
	private void setup() {
		CreateBooking createBooking1 = createBooking("John", 561, "Breakfast");
		
		System.out.println("1. Initial booking Created, Booking ID : "+createBooking1.getBookingid());
		
		CreateBooking createBooking2 = createBooking("Jane", 554, "Extra Hard pillow");
		
		System.out.println("2. Initial booking Created, Booking ID : "+createBooking2.getBookingid());
	}
	
	private CreateBooking createBooking(String mFirstName, double mPrice, String mAdditionalNeeds) {
		Booking bookingObj = new Booking();
		BookingDates bookingDates = new BookingDates();
		
		Date checkinDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(checkinDate);
		c.add(Calendar.DATE, 10);
		
		Date checkoutDate = c.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		
		bookingDates.setCheckin(sdf.format(checkinDate));
		bookingDates.setCheckout(sdf.format(checkoutDate));
		
		bookingObj.setFirstname(mFirstName);
		bookingObj.setLastname("Doe");
		bookingObj.setBookingdates(bookingDates);
		bookingObj.setDepositpaid(true);
		bookingObj.setTotalprice(mPrice);
		bookingObj.setAdditionalneeds(mAdditionalNeeds);
		
		return service.createBooking(bookingObj);
	}
}
