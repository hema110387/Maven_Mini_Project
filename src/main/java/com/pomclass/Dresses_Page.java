package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Page {

	public WebDriver driver;

	public Dresses_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getPrinted_dress() {
		return printed_dress;
	}
	

	@FindBy(xpath = "(//a[text()='Dresses'])[2]")
	private WebElement dresses;

	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement printed_dress;
	
	
	
	
	

}
