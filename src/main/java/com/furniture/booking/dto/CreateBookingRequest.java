package com.furniture.booking.dto;

import java.time.LocalDate;

public class CreateBookingRequest {
	
	 private Long id;
	   private String userId;
	   private LocalDate bookingDate;
	   private String name;
	   private Long contact;
	public CreateBookingRequest(Long id, String userId, LocalDate bookingDate, String name, Long contact) {
		super();
		this.id = id;
		this.userId = userId;
		this.bookingDate = bookingDate;
		this.name = name;
		this.contact = contact;
	}
	public CreateBookingRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "CreateBookingRequest [id=" + id + ", userId=" + userId + ", bookingDate=" + bookingDate + ", name="
				+ name + ", contact=" + contact + "]";
	}
	   
	   

}
