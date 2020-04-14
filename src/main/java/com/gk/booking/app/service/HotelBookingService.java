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
	
	/**
	 * 
	 * @param mId
	 * @param mBooking
	 * @return
	 */
	public Booking updateBooking(Integer mId, Booking mBooking) {
		Booking oldBooking = repository.getOne(mId);
		
		if(mBooking.getFirstname() != null) {
			oldBooking.setFirstname(mBooking.getFirstname());
		}
		if(mBooking.getLastname() != null) {
			oldBooking.setLastname(mBooking.getLastname());
		}
		if(mBooking.getAdditionalneeds() != null) {
			oldBooking.setAdditionalneeds(mBooking.getAdditionalneeds());
		}
	
		oldBooking.setTotalprice(mBooking.getTotalprice());
		oldBooking.setDepositpaid(oldBooking.isDepositpaid());
		
		if(mBooking.getBookingdates() != null) {
			oldBooking.setBookingdates(mBooking.getBookingdates());
		}
		
 		
		return repository.save(oldBooking);
		
	}

}
