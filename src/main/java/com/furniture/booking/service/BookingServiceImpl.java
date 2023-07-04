package com.furniture.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furniture.booking.dao.BookingRepository;
import com.furniture.booking.entity.Booking;
import com.furniture.booking.exception.UserNotFoundException;



@Service
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Override
	public Booking createBooking(Booking book) {
		
        return bookingRepository.save(book);
	}
	@Override
	public Booking getBookingById(Long id) 
	{
		return bookingRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("Booking not found with id: " + id));
	}
	@Override
	public List<Booking> getAllBookings() {
		return bookingRepository.findAll();
	}
	@Override
	public Booking updateBooking(Long id, Booking updatedBooking) {
		Booking existingBooking = getBookingById(id);
        existingBooking.setUserid(updatedBooking.getUserid());
        existingBooking.setBookingDate(updatedBooking.getBookingDate());
        return bookingRepository.save(existingBooking);
	}
	
	@Override
	public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);

	}
	
	
	


	
	

}
