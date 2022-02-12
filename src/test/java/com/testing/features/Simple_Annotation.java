package com.testing.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {

	@BeforeSuite
	public void property() {
		System.out.println("Property setting");
	}

	@BeforeTest
	public void browser() {
		System.out.println("browser Launch");
	}

	@BeforeClass
	public void url() {
		System.out.println("url Launch");
	}

	@BeforeMethod
	public void login() {
		System.out.println("login");
	}

	@Test
	public void men() {
		System.out.println("Tshirt");
	}

	@Test(invocationCount = 2)
	public void women() {
		System.out.println("Kurtha");
	}

	@Test
	public void kids() {
		System.out.println("Frock");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}

	@AfterClass
	public void homepage() {
		System.out.println("home Page");
	}

	@AfterTest
	public void delete_Cookies() {
		System.out.println("Delete Cookies");
	}

	@AfterSuite
	public void quit_Browser() {
		System.out.println("Quit the browser");
	}

}
