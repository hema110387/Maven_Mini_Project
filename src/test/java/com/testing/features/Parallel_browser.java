package com.testing.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel_browser {
	@Test
	private void chromeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Desktop\\chromedriver2\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	}
	@Test
	private void firefox() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Ganesh\\eclipse-workspace\\LetsCode\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	}
	
	
	
	

}
