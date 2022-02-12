package com.testing.features;

import org.testng.annotations.Test;

public class Expected_Exceptions {

	@Test(expectedExceptions=NullPointerException.class)
	public void demo() {

		String s=null;
		int len=s.length();
		System.out.println(len);
		
	}
	
	
	
	
	
	
	
	
}
