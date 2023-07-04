package com.furniture.booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furniture.booking.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

	

}
