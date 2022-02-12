package com.testing.features;

import org.testng.annotations.Test;

public class Grouping_Concept {

	@Test(groups="Vegetables")
	public void potato() {
		System.out.println("potato");
	}
	
	@Test(groups="Vegetables")
	public void tomato() {
		System.out.println("tomato");
	}
	
	@Test(groups="Vegetables")
	public void carrot() {
		System.out.println("carrot");
	}
	
	@Test(groups="Fruits")
	public void orange() {
		System.out.println("orange");
	}
	
	@Test(groups="Fruits")
	public void apple() {
		System.out.println("apple");
	}
	
	@Test(groups="Fruits")
	public void Pineapple() {
		System.out.println("pineapple");
	}
	
	@Test(groups="Vehicles")
	public void car() {
		System.out.println("car");
	}
	
	@Test(groups="Vehicles")
	public void bike() {
		System.out.println("bike");
	}
	
}
