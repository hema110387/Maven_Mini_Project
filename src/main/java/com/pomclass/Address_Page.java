package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {

	public WebDriver driver;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement proceed_to_checkout2;

	public Address_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed_to_checkout2() {
		return proceed_to_checkout2;

	}

}
