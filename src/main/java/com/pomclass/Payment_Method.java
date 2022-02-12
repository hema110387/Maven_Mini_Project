package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Method {

	public WebDriver driver;

	public Payment_Method(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBank_wire() {
		return bank_wire;
	}

	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bank_wire;

}
