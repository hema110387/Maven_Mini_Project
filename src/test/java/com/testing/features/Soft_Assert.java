package com.testing.features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Soft_Assert {
	
	@Test
	public void password() {

		String exp = "HemaLatha123";
		String act = "hemalatha123";
		SoftAssert s = new SoftAssert();
		s.assertEquals(act, exp);
		System.out.println("Verification");

	}

}
