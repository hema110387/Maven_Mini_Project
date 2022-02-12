package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_LoginPage {

	public WebDriver driver;

	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement button;

	public Facebook_LoginPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getButton() {
		return button;
	}

}


