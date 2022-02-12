package com.Maven_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassFaceBook {
	public static WebDriver driver;
	
	//BrowserLaunch
	public static WebDriver browserLaunch(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		return driver;
	}
	
	//get
	
	public static void launchUrl(String url) {
		driver.get(url);
	}

	// Close
	public static void CloseBrowser() {
		driver.close();
	}

	// Quit
	public static void quitBrowser() {
		driver.quit();
	}

	// SendKeys
	public static void inputValues(WebElement element, String input) {
		element.sendKeys(input);
	}

	// Click

	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	// DropDown
		// single DropDown
		public static void singleDropDown_byvalue(WebElement element, String value) {
			Select s = new Select(element);
			s.selectByValue(value);
		}

		public static void singleDropDown_byvisibleText(WebElement element, String value) {
			Select s = new Select(element);
			s.selectByVisibleText(value);
		}

		public static void singleDropDown_byindex(WebElement element, int index) {
			Select s = new Select(element);
			s.selectByIndex(index);
		}
		// implicitWait
		public static void implicitlyWait(int time) {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

		}
	
	
}
