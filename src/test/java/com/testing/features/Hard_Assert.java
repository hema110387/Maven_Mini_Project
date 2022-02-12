package com.testing.features;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Hard_Assert {
	
	@Test
	public void password() {

		String exp = "HemaLatha123";
		String act = "HemaLatha123";
		Assert.assertEquals(act,exp );
		System.out.println("Validation");

	}

}
