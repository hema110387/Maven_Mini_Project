package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Page {
	
	public WebElement getAdd_quantity() {
		return add_quantity;
	}

	public WebElement getAdd_to_cart() {
		return add_to_cart;
	}

	public WebElement getProceed_to_checkout() {
		return proceed_to_checkout;
	}

	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement add_quantity;
	
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement add_to_cart;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement proceed_to_checkout;
	
	public WebDriver driver;

	public Order_Page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	
	



	


	


	
	
	
	
	
	
}
