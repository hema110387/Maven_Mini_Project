package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_HotelPage {
	
	public WebDriver driver;
	
	public Book_HotelPage(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getBilling_address() {
		return billing_address;
	}

	public WebElement getCredit_card_no() {
		return credit_card_no;
	}

	public WebElement getCredit_card_type() {
		return credit_card_type;
	}

	public WebElement getExpiry_month() {
		return expiry_month;
	}

	public WebElement getExpiry_year() {
		return expiry_year;
	}

	public WebElement getCvv_no() {
		return cvv_no;
	}

	public WebElement getBook_btn() {
		return book_btn;
	}

	@FindBy(id = "first_name")
	private WebElement first_name ;
	
	@FindBy(id = "last_name")
	private WebElement last_name ;
	
	@FindBy(id = "address")
	private WebElement billing_address ;
	
	@FindBy(id = "cc_num")
	private WebElement credit_card_no ;
	
	@FindBy(id = "cc_type")
	private WebElement credit_card_type ;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expiry_month ;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expiry_year ;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv_no ;
	
	@FindBy(id = "book_now")
	private WebElement  book_btn ;
	
	
	
	
}
