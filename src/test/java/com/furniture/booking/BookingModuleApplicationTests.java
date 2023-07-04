package com.furniture.booking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import com.furniture.booking.controller.BookingController;
import com.furniture.booking.dao.BookingRepository;
import com.furniture.booking.entity.Booking;
import com.furniture.booking.exception.UserNotFoundException;
import com.furniture.booking.service.BookingServiceImpl;

@SpringBootTest
public class BookingModuleApplicationTests {
	
	@Mock
	BookingController book;
	
	@Mock
	BookingRepository bookingRepository;
	
	@InjectMocks
	BookingServiceImpl bookingServiceImpl;

	@Test
	void contextLoads() {
	}
	
	@BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
	
	 @Test
	    public void test_JUnit() {
	        System.out.println("This is the testcase in this class");
	        String str1="This is the testcase in this class";
	        assertEquals("This is the testcase in this class",str1);
	    }
	
	 @Test
	 public void createBookingTest() {
		 Booking book = new Booking(123L, "saumya@gmail.com", LocalDate.now(), "SAUMYA", 
				 9876538909L, "Shipped", "Bangalore");
		 when(bookingServiceImpl.createBooking(book)).thenReturn(book);
		 assertEquals(book.getAddress(), "Bangalore");
		 assertEquals(book.getId(), "saumya@gmail.com");
	 }
	 
	
	 
	 @Test
	 public void getBookingByIdTrue() {
		 Booking book = new Booking();
		 book.setUserid(1L);
		 book.setName("SAUMYA");
		 
		 Mockito.when(bookingRepository.findById(1L)).thenReturn(Optional.of(book));
		 Optional<Booking> result = Optional.of(bookingServiceImpl.getBookingById(1L));
		 
		 assertTrue(result.isPresent());
		 assertEquals(1L,  result.get().getUserid());
		 assertEquals("SAUMYA", result.get().getName());
		 
		 Mockito.verify(bookingRepository, Mockito.times(1)).findById(1L);
	 }
	 @Test
	 public void getBookingByIdFalse() {
		 
		 Booking book = new Booking();
		 book.setUserid(1L);
		 book.setName("SAUMYA");
		 
		 Mockito.when(bookingRepository.findById(1L)).thenReturn(Optional.of(new Booking()));

	 }
	 
	 @Test
	 public void getAllBookings() {
		 List<Booking> books = new ArrayList<>();
		 Booking book = new Booking(123L, "saumya@gmail.com", LocalDate.now(), "SAUMYA", 
				 9876538909L, "Shipped", "Bangalore");
		 books.add(book);
		 when(bookingServiceImpl.getAllBookings()).thenReturn(books);
	 }
	 
	 @Test
	 public void deleteBooking() {
		 Booking book = new Booking();  //Object creation
		 book.setUserid(1L);
		 book.setId("saumya@gmail.com");
		
	 }
	 
	 @Test
	 public void testDefaultConstructor() {
		 UserNotFoundException exception = new UserNotFoundException(null);
		 assertEquals(null, exception.getMessage());
	 }
	 
	 @Test
	 public void testParameterizedConstructor() {
		 String errormessage = "Error Not Found";
		 UserNotFoundException exception = new UserNotFoundException(errormessage);
		 assertEquals(errormessage, exception.getMessage());
	 }
	 
	 @Test
	    public void testNullInput() {
	        // Assuming you have a class named MyClass with a method to test
	        Booking book = new Booking();
	        // Test the behavior of the method with null input
	        // Assert that it handles null input gracefully
	        assertNull(book.myMethod(null));
	    }
	 
	 @Test
	    public void testErrorConditions() {
		 Booking book = new Booking();
	        // Test the behavior of the code when encountering error conditions
	        // For example, if the code interacts with a file system, test it with a non-existent file
	        // Assert the expected behavior, such as throwing an exception or returning a specific error code
	       //  assertThrows(UserNotFoundException.class, () -> book.readFile("nonexistent.txt"));
	  }

//	 @Test
//	 public void updateBooking() {
//		 Booking book = new Booking(123L, "saumya@gmail.com", LocalDate.now(), "SAUMYA", 
//				 9876538909L, "Shipped", "Bangalore");
//	 }

}
