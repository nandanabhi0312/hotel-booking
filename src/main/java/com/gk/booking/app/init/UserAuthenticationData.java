package com.gk.booking.app.init;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class UserAuthenticationData {
	private Map<String, String> userDataMap = new HashMap<String, String>();

	public void initializeUserData() {

		try {
			userDataMap.put("jacksparrow", "jacksparrow123");
			userDataMap.put("coronavirus", "coronavirus123");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param userName
	 * @return
	 */
	public String getUserPassword(String userName) {
		return userDataMap.get(userName) == null ? "" : userDataMap.get(userName);
	}
}
