package com.testing.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test(priority = -2)
	public void potato() {
		System.out.println("Potato");
	}
	
	@Test(priority = -1)
	public void tomato() {
		System.out.println("Tomato");
	}
	
	@Ignore
	@Test
	public void Cabbage() {
		System.out.println("Cabbage");
	}
	
	@Test(priority = 0)
	public void Brinjal() {
		System.out.println("Brinjal");
	}
	
	@Test(enabled=false)
	public void Banana() {
		System.out.println("Banana");
	}
	
	@Test
	public void Apple() {
		System.out.println("Apple");
	}
	
	@Test
	public void Grapes() {
		System.out.println("Grapes");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
