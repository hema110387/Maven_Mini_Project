package com.Maven_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_BaseClass {

	public static WebDriver driver;

	// BrowserLaunch
	public static WebDriver browserLaunch(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Desktop\\chromedriver2\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Desktop\\chromedriver2\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		return driver;
	}

	// Get
	public static void launchUrl(String url) {
		driver.get(url);
	}

	// Close
	public static void CloseBrowser() {
		driver.close();
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

	// ScreenShot

	public static void screenShot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(location);
		FileUtils.copyFile(src, dest);
	}
	
	// implicitWait
		public static void implicitlyWait(int time) {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

		}

}


