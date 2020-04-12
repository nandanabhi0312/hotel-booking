package com.gk.booking.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.booking.app.entity.Booking;
import com.gk.booking.app.entity.BookingId;
import com.gk.booking.app.entity.CreateBooking;
import com.gk.booking.app.repository.HotelBookingRepository;

/**
 * 
 * @author Gowrav Krishnamurthy
 *
 */
@Service
public class HotelBookingService { 

	@Autowired
	private HotelBookingRepository repository;
	
	/**
	 * 
	 * @param mBooking
	 * @return
	 */
	public CreateBooking createBooking(Booking mBooking) {
		Booking newBooking = repository.save(mBooking);
		return new CreateBooking(newBooking);
	}

	/**
	 * 
	 * @return
	 */
	public List<BookingId> getBookings() {
		List<Booking> bookingList = repository.findAll();

		List<BookingId> bookingIDList = new ArrayList<BookingId>();
		for (Booking booking : bookingList) {
			bookingIDList.add(new BookingId(booking.getId()));
		}

		return bookingIDList;
	}
	
	/**
	 * 
	 * @param mId
	 * @return
	 */
	public Booking getBooking(Integer mId) {
		return repository.findById(mId).get();
	}

}
