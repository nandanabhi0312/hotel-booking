package com.gk.booking.app.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingId {
	
	public BookingId(Integer mBookingID) {
		this.bookingid = mBookingID;
	}
	
	@JsonProperty(value = "bookingid")
	private Integer bookingid;

	public Integer getBookingid() {
		return bookingid;
	}

	public void setBookingid(Integer bookingid) {
		this.bookingid = bookingid;
	}

}
