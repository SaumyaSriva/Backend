package com.furniture.booking.entity;

import java.time.LocalDate;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;





@Entity
	@Table(name = "bookings")
	public class Booking {

	    @jakarta.persistence.Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long userid;

	    @NotNull
	    @Column(name = "user_emailId")
	    private String Id;

	    @NotNull
	    @Column(name = "booking_date")
	    private LocalDate bookingDate;
	    
	    @NotNull
	    @Column(name = "Name")
	    private String name;
	    
	    @NotNull
	    @Column(name = "DeliveryBoy_Contact")
	    private Long contact;
	    
	    @NotNull
	    @Column(name = "Status")
	    private String status;
	    
	    @NotNull
	    @Column(name = "Address")
	    private String address;
	    

		public Booking() {
			super();
			}


		public Booking(Long userid, String id, LocalDate bookingDate, String name, Long contact, String status,
				String address) {
			super();
			this.userid = userid;
			this.Id = id;
			this.bookingDate = bookingDate;
			this.name = name;
			this.contact = contact;
			this.status = status;
			this.address = address;
		}


		public Long getUserid() {
			return userid;
		}


		public void setUserid(Long userid) {
			this.userid = userid;
		}


		public String getId() {
			return Id;
		}


		public void setId(String id) {
			this.Id = id;
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


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		@Override
		public String toString() {
			return "Booking [userid=" + userid + ", Id=" + Id + ", bookingDate=" + bookingDate + ", name=" + name
					+ ", contact=" + contact + ", status=" + status + ", address=" + address + "]";
		}


		public Object myMethod(Object object) {
			// TODO Auto-generated method stub
			return null;
		}


		public Object readFile(String string) {
			// TODO Auto-generated method stub
			return null;
		}

		
		


		
		

}
