package com.testing.features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer {

	int start = 0;
	int end = 2;

	@Override
	public boolean retry(ITestResult result) {
		if (start < 2) {
			start++;
			return true;
		}

		return false;
	}

}
