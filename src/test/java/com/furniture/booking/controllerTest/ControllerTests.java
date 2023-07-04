package com.furniture.booking.controllerTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.furniture.booking.controller.BookingController;
import com.furniture.booking.entity.Booking;
import com.furniture.booking.service.BookingServiceImpl;

@SpringBootTest
public class ControllerTests {

	
	@InjectMocks
	private BookingController bookingController;
	
	@Mock
	private BookingServiceImpl bookingServiceImpl;
	@Test
	public void createBookingTest() {
		Booking book = new Booking();
		book.setId("98763");
		book.setName("Bookin-1");
		book.setAddress("Bangalore");
		book.setContact(7651782L);
		book.setStatus("SUCCESS");
		book.setUserid(123L);
		
		when(bookingController.createBooking(book)).thenReturn(book);
		assertEquals("Bangalore", book.getAddress());
		
	}
//	@Test
//	public void getBookingById() {
//		Booking book = new Booking();
//		when(bookingController.getBookingById(1L)).thenReturn(book);
//		assertEquals(1L, book.getId());
//		
//	}
	@Test
	public void getAllBookings() {
		List<Booking> books = new ArrayList<>();
		Booking book = new Booking();
		Booking bookk = new Booking(1234L, "hello@gmail.com", LocalDate.now(),
				"Hello", 7499374733L, "Shipped", "Delhi");
		
		book.setUserid(1526L);
		book.setId("khushi@gmail.com");
		book.setBookingDate(LocalDate.now());	
		book.setName("Khushi");
		book.setContact(922334611L);
		book.setStatus("Shipped");
		book.setAddress("Kanpur");
		books.add(bookk);
		books.add(book);
		
		assertEquals(1526L, book.getUserid());
		assertEquals(LocalDate.now(), book.getBookingDate());
		assertEquals(922334611L, book.getContact());
		assertEquals("Shipped", book.getStatus());
		when(bookingController.getAllBookings()).thenReturn(books);
		
	}
	
//	@Test
//	public void deleteBooking() {
//		
//	}
	
}
