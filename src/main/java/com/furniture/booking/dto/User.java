package com.furniture.booking.dto;

public class User {

	private String userId;
	private String useremail;
	private String password;
	private String username;
	private Long contactNo;
	private String gender;
	private String age;
	public User(String userId, String useremail, String password, String username, Long contactNo, String gender,
			String age) {
		super();
		this.userId = userId;
		this.useremail = useremail;
		this.password = password;
		this.username = username;
		this.contactNo = contactNo;
		this.gender = gender;
		this.age = age;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", useremail=" + useremail + ", password=" + password + ", username="
				+ username + ", contactNo=" + contactNo + ", gender=" + gender + ", age=" + age + "]";
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
