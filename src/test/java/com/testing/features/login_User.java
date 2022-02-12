package com.testing.features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class login_User {

	@Test
	@Parameters({"username","password"})
	public void login(String username,String password) {
		System.out.println("user is :"+username);
		System.out.println("password  is :"+password);
	}
	
	
	
	
	
}
