package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_AccountPage {
	
	
	public WebDriver driver;
	
	@FindBy(name="firstname")
	private WebElement First_name;
	
	public Facebook_AccountPage(WebDriver driver2) {

		this.driver=driver2;
		  PageFactory.initElements(driver, this);
	}

	public WebElement getFirst_name() {
		return First_name;
	}

	public WebElement getSur_name() {
		return Sur_name;
	}

	public WebElement getMobile_no() {
		return mobile_no;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getBtn() {
		return btn;
	}

	@FindBy(name="lastname")
	private WebElement Sur_name;
	
	@FindBy(name="reg_email__")
	private WebElement mobile_no;
	
	@FindBy(id="password_step_input")
	private WebElement password;
	
	@FindBy(id="day")
	private WebElement day;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(xpath="(//input[@name='sex'])[1]")
	private WebElement btn;
	
	

}
