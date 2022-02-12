package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmation {

	public WebDriver driver;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement confirm_order;

	public OrderConfirmation(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConfirm_order() {
		return confirm_order;
	}

}
