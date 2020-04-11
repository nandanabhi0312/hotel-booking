package com.gk.booking.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.booking.app.entity.Booking;
import com.gk.booking.app.entity.CreateBooking;
import com.gk.booking.app.repository.HotelBookingRepository;

@Service
public class HotelBookingService {
	
	@Autowired
	private HotelBookingRepository repository;
	
	public CreateBooking createBooking(Booking mBooking) {
		Booking newBooking = repository.save(mBooking);
		return new CreateBooking(newBooking);
	}

}
