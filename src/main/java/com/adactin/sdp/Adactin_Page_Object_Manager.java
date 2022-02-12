package com.adactin.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Adactin_LoginPage;
import com.pomclass.Adactin_SelectHotel;
import com.pomclass.Book_HotelPage;
import com.pomclass.Booking_ConfirmationPage;
import com.pomclass.Search_HotelPage;


public class Adactin_Page_Object_Manager {

	public WebDriver driver;
	private Adactin_LoginPage al;
	private Search_HotelPage sh;
	private Adactin_SelectHotel as;
	private Book_HotelPage bh;
	private Booking_ConfirmationPage bc;
	
	
	public Adactin_Page_Object_Manager(WebDriver driver2) {
		
		this.driver=driver2;
	}


	public Adactin_LoginPage getInstanceAL() {
		if(al==null) {
			al=new Adactin_LoginPage(driver);
		}
		return al;
	}
	
	
	public Search_HotelPage getInstanceSH() {
		if(sh==null) {
			sh=new Search_HotelPage(driver);
		}
		return sh;
	}
	
	public  Adactin_SelectHotel  getInstanceAS() {
		if(as==null) {
			as=new  Adactin_SelectHotel(driver);
		}
		return as;
	}
	
	public  Book_HotelPage  getInstanceBH() {
		if(bh==null) {
			bh=new  Book_HotelPage(driver);
		}
		return bh;
	}
	
	
	public  Booking_ConfirmationPage  getInstanceBC() {
		if(bc==null) {
			bc=new  Booking_ConfirmationPage(driver);
		}
		return bc;
	}
	
	
	
	
}
