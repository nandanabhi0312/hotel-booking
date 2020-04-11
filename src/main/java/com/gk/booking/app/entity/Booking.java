package com.gk.booking.app.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@Entity
@Table(name = "hotel_bookings")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Booking implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5146623885432706329L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Integer id;
	
	@JsonProperty(value = "firstname")
	@Column(name = "first_name")
	private String firstname;

	@JsonProperty(value = "lastname")
	@Column(name = "last_name")
	private String lastname;
	
	@JsonProperty(value = "totalprice")
	@Column(name = "total_price")
	private double totalprice;	

	@JsonProperty(value = "depositpaid")
	@Column(name = "deposit_paid")
	private boolean depositpaid;
	
	@JsonProperty(value = "additionalneeds")
	@Column(name = "additional_needs")
	private String additionalneeds;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "booking")
	@JsonProperty(value="bookingdates")
	private BookingDates bookingdates;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

}
