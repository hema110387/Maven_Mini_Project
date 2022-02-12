package com.testing.features;

import org.testng.annotations.Test;

public class Timeout_Conept {

	@Test(timeOut=8000)
	public void demo() throws InterruptedException {
		
		System.out.println("Browser Launch");
		Thread.sleep(1000);
		
		System.out.println("Url Launch");
		Thread.sleep(3000);
		
		System.out.println("Click Login");
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
	
	
	
}
