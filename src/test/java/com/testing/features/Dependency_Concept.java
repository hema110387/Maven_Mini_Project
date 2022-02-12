package com.testing.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_Concept {

	@Ignore
	@Test
	public void completion_Ug() {
		System.out.println("Completion of UG Course");
	}
	
	@Test(dependsOnMethods = "completion_Ug")
	public void confirm_Job() {
		System.out.println("Qualifying for apply Job");
	}
}
