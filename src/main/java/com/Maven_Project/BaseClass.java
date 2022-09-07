package com.Maven_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	// BrowserLaunch
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

	// Navigate_to
	public static void navigateToUrl(String url) {
		driver.navigate().to(url);
	}

	// navigate_back
	public static void navigateBackUrl() {
		driver.navigate().back();

	}
	// getTitle

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	// navigate_forward
	public static void navigateForwardUrl() {
		driver.navigate().forward();
	}

	// navigate_Refresh
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	// Alert

	// SimpleAlert
	public static void simpleAlert() {
		driver.switchTo().alert().accept();
	}

	// ConfirmAlert
	public static void confirmAlert(String name1) {
		if (name1.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (name1.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}

	}

	// PromptAlert
	public static void promptAlert(String input, String name) {
		driver.switchTo().alert().sendKeys(input);

		String text = driver.switchTo().alert().getText();
		System.out.println(text);

		if (name.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (name.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}

	}

	// Actions
	// Click
	public static void clickButton(WebElement element) {
		Actions ac = new Actions(driver);
		ac.click(element).build().perform();
	}

	// Double Click
	public static void doubleClickButton(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).build().perform();
	}

	// Right Click
	public static void rightClickButton(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}

	// MoveToElement
	public static void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	// DragandDrop
	public static void dragandDrop(WebElement source, WebElement destination) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, destination).build().perform();
	}

	// Frame
	// single frame
	public static void singleFrame_index(int index) {
		driver.switchTo().frame(index);
	}

	public static void singleFrame_id(String id) {
		driver.switchTo().frame(id);
	}

	public static void singleFrame_webElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	// defaultContent -(from frame to main page)
	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}

	// Multiple Frames
	// outerframe
	public static void outerFrame_webElement(WebElement outerElement) {
		driver.switchTo().frame(outerElement);
	}

	// innerframe
	public static void inerFrame_webElement(WebElement innerElement) {
		driver.switchTo().frame(innerElement);
	}
	// parentframe(From inner to outer frame)

	public static void parentFrame_webElement(WebElement parentElement) {
		driver.switchTo().frame(parentElement);
	}

	// Robot
	public static void robot(WebElement element) throws AWTException {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// WindowHandle
	// current window(parent window) handle
	public static void singleWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	// Multiple Windows Handle
	public static void multipleWindowHandle(String id) {
		Set<String> windowHandles = driver.getWindowHandles();

		for (String str : windowHandles) {
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
		}
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

	public static void singleDropDown_deselect_byvalue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	public static void singleDropDown_deselect_byvisibleText(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByVisibleText(value);
	}

	public static void singleDropDown_deselect_byindex(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	// Multiple DropDown
	// isMultiple
	public static void ismultiple(WebElement element) {
		Select s = new Select(element);
		boolean b = s.isMultiple();
		System.out.println("is multiple = " + b);
	}

	// getoptions
	public static void getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> alloptions = s.getOptions();
		for (WebElement all : alloptions) {
			String text = all.getText();
			System.out.println(text);
		}

	}

	// Allselected Options
	public static void getallSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement allselected : allSelectedOptions) {
			String text = allselected.getText();
			System.out.println(text);
		}
	}

	// getFirstselected options
	public static void getfirstSelectedOptions(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelected = s.getFirstSelectedOption();
		String text = firstSelected.getText();
		System.out.println(text);
	}

	// deselectAll
	public static void deselectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	// checkBox
	public static void checkBox(WebElement element) {
		element.click();
	}

	// isEnabled
	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println("is enabled : " + enabled);
	}

	// isDisplayed
	public static void isDisplayed(WebElement element) {
		boolean dis = element.isDisplayed();
		System.out.println("is displayed" + dis);
	}

	// isSelected
	public static void isSelected(WebElement element) {
		boolean select = element.isSelected();
		System.out.println("is Selected" + select);
	}

	// getText
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	// getAttribute
	public static void getAttribute(WebElement element, String input) {
		element.getAttribute(input);
	}

	// wait
	// implicitWait
	public static void implicitlyWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	// ExplicitWait
	public static void explicitlyWait(int time, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	// ScreenShot

	public static void screenShot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(location);
		FileUtils.copyFile(src, dest);
	}

	// thread.sleep

	public static void thread_sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}
	// scrollDown&ScrollUp

	public static void scrollup_down(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

}
