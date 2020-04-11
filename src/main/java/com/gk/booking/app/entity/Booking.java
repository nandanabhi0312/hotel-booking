package com.gk.booking.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue
	private Integer id;

}
