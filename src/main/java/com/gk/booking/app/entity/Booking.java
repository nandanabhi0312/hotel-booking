package com.gk.booking.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;



@Entity
@Table(name = "hotel_bookings")
public class Booking {
	
	@Id
	@GeneratedValue
	@JsonIgnore
	private Integer id;
	
	@JsonProperty(value = "firstname")
	@Column(name = "first_name")
	private String firstname;

}
