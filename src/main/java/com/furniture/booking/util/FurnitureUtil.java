package com.furniture.booking.util;

import com.furniture.booking.dto.User;
import com.furniture.booking.entity.UserDetails;

public class FurnitureUtil {

	public User toDetails1(UserDetails ud) {
		User user = null;
		user = new User(ud.getUserId(),ud.getUseremail(),
				ud.getPassword(),ud.getUsername(),
				ud.getContactNo(),ud.getGender(),ud.getAge());
		
		return user;
	}
}
