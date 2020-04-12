package com.gk.booking.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gk.booking.app.entity.Booking;

public interface HotelBookingRepository extends JpaRepository<Booking, Integer>{

}
