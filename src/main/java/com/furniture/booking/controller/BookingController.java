package com.furniture.booking.controller;

//import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.furniture.booking.dto.CreateBookingRequest;
import com.furniture.booking.entity.Booking;
import com.furniture.booking.service.BookingService;

import com.furniture.booking.util.FurnitureUtil;

@RequestMapping("/furniture_booking")
@RestController
@CrossOrigin("*")
public class BookingController {
	
	@Autowired 
	private BookingService service;
	
//	@Autowired
//	private FurnitureUtil furnitureUtil;

	Logger logger = LoggerFactory.getLogger(BookingController.class);
	
	private final Logger mylogs = LoggerFactory.getLogger(this.getClass());
	
	 @PostMapping
	    public Booking createBooking( @RequestBody Booking booking) {
	    	System.out.println("passing 1 ");
	        Booking create = service.createBooking(booking);
	        System.out.println("passed.");
	        mylogs.info("Booking Id has been created.");
	        return create;
	    }

//	    @GetMapping("/{id}")
//	    public ResponseEntity<Booking> getBookingById(@PathVariable Long id) {
//	        Booking booking = service.getBookingById(id);
//	        logger.info("Value is added");
//	        mylogs.info("Get booking details");
//	        return new ResponseEntity<>(booking, HttpStatus.OK);    
//	    }

	 @GetMapping("/{id}")
	    public Booking getBookingById(@PathVariable Long id) {
	        Booking booking = service.getBookingById(id);
	        logger.info("Value is added");
	        mylogs.info("Get booking details");
	        return booking;    
	    }
	 
//	    @GetMapping
//	    public ResponseEntity<List<Booking>> getAllBookings() {
//	        List<Booking> bookings = service.getAllBookings();
//	        mylogs.info("Getting all the values.");
//	        return new ResponseEntity<>(bookings, HttpStatus.OK);
//	        //mylogs.info("Getting all the values.");
//	        
//	    }
	 
	 @GetMapping
	    public List<Booking> getAllBookings() {
	        List<Booking> bookings = service.getAllBookings();
	        mylogs.info("Getting all the values.");
	        return bookings;
	        //mylogs.info("Getting all the values.");
	        
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Booking> updateBooking(
	            @PathVariable Long id, @Validated @RequestBody Booking updatedBooking) {
	        Booking booking = service.updateBooking(id, updatedBooking);
	        mylogs.info("Update the record by ID");
	        return new ResponseEntity<>(booking, HttpStatus.OK);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteBooking(@PathVariable Long id) {
	       service.deleteBooking(id);
	       mylogs.info("Delete the record by ID");
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
}
