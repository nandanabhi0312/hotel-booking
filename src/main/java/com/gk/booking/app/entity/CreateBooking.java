package com.gk.booking.app.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateBooking {
	
	@JsonProperty(value = "bookingid")
	private Integer bookingid;
	
	@JsonProperty(value = "booking")
	private Booking booking;

	public CreateBooking(Booking pBooking) {
		this.booking = pBooking;
		this.bookingid = pBooking.getId();
	}

	public Integer getBookingid() {
		return bookingid;
	}

	public void setBookingid(Integer pBookingid) {
		this.bookingid = pBookingid;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking pBooking) {
		this.booking = pBooking;
	}
}
