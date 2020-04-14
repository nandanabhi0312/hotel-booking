package com.gk.booking.app.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gk.booking.app.init.UserAuthenticationData;

@Service
public class HotelBookingUserDetailsService implements UserDetailsService {

	@Autowired
	private UserAuthenticationData userData;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		return new User(userName, userData.getUserPassword(userName), new ArrayList<>());
	}
}
