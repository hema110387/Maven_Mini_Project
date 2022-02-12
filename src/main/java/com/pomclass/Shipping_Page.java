package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {

	public WebDriver driver;

	@FindBy(id = "cgv")
	private WebElement click_button;

	@FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceed_to_checkout3;

	public Shipping_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClick_button() {
		return click_button;
	}

	public WebElement getProceed_to_checkout3() {
		return proceed_to_checkout3;
	}

}
