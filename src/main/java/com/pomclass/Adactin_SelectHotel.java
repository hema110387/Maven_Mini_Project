package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_SelectHotel {
	
	public WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement select_hotel;

	

	public Adactin_SelectHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelect_hotel() {
		return select_hotel;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	}

	@FindBy(id = "continue")
	private WebElement continue_btn;

}
