package com.gk.booking.app.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gk.booking.app.entity.AuthenticationResponse;
import com.gk.booking.app.service.HotelBookingUserDetailsService;
import com.gk.booking.app.util.JwtUtil;

@RequestMapping(value = "/api/auth")
@RestController
public class AuthenticationController {

	@Autowired
	private JwtUtil jwtTokenUtil;

	@Autowired
	private HotelBookingUserDetailsService userDetailsService;
	
	@Autowired
	private AuthenticationManager authManager;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public @ResponseBody AuthenticationResponse getAuthToken(@RequestParam String username,
			@RequestParam String password) throws Exception {
		try {
			authManager.authenticate(new UsernamePasswordAuthenticationToken(
					username, password));
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password", e);
		}

		final UserDetails userDetails = userDetailsService.loadUserByUsername(username);

		final String jwt = jwtTokenUtil.generateToken(userDetails);

		return new AuthenticationResponse(jwt);
	}
}
