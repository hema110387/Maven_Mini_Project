package com.testing.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Test {

	@Test(dataProvider = "inputData")
	public void credentials(String username, String password) {

		System.out.println("username is : " + username);
		System.out.println("password is : " + password);

	}

	@DataProvider
	public Object[][] inputData() {

		return new Object[][] {

				{ "Hema", "11387" }, 
				{ "Saru", "7890" }, 
				{ "Yeesha", "1008" }, 
				{ "Krithik", "2501 "}

		};
	}

}