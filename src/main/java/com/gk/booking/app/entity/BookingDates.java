package com.gk.booking.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "booking_dates")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingDates implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 5023332813623069189L;

	@OneToOne
	@JoinColumn(name = "booking_id")
	@JsonIgnore
	@Id
	private Booking booking;

	@JsonProperty(value = "checkin")
	@Column(name = "check_in_dt")
	private String checkin;

	@JsonProperty(value = "checkout")
	@Column(name = "check_out_dt")
	private String checkout;

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}
}
