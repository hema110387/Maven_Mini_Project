package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_HotelPage {

	public WebDriver driver;
	
	public Search_HotelPage(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getNumber_of_rooms() {
		return number_of_rooms;
	}

	public WebElement getCheck_in() {
		return check_in;
	}

	public WebElement getCheck_out() {
		return check_out;
	}

	public WebElement getAdults_room() {
		return adults_room;
	}

	public WebElement getChildren_room() {
		return children_room;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement room_type;
	
	@FindBy(id="room_nos")
	private WebElement number_of_rooms;
	
	@FindBy(id="datepick_in")
	private WebElement check_in;
	
	@FindBy(id="datepick_out")
	private WebElement check_out;
	
	@FindBy(id="adult_room")
	private WebElement adults_room ;
	
	@FindBy(id="child_room")
	private WebElement children_room;
	
	@FindBy(id="Submit")
	private WebElement search;
}
