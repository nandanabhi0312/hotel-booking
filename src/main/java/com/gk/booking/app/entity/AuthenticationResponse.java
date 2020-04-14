package com.gk.booking.app.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthenticationResponse {
	@JsonProperty(value="token")
	private String token;
	
	public AuthenticationResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
	
	
}
