package com.furniture.booking.service;

import java.util.List;

import com.furniture.booking.entity.Booking;

public interface BookingService {

	Booking createBooking(Booking book);

	Booking getBookingById(Long id);

	List<Booking> getAllBookings();

	Booking updateBooking(Long id, Booking updatedBooking);

	void deleteBooking(Long id);

}
