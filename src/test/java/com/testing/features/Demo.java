      package com.testing.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo{

	@Test
	public void login1() {

		String exp="Sarulatha";
		String act="Sarulatha";
		Assert.assertEquals(act,exp);
		
	}
	@Test
	public void login2() {

		String exp="Saru";
		String act="Saru123";
		Assert.assertEquals(act,exp);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
