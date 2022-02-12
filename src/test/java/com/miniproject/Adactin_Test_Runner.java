package com.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Maven_Project.Adactin_BaseClass;
import com.adactin.sdp.Adactin_Page_Object_Manager;
import com.helper.Adactin_File_Reader_Manager;
import com.pomclass.Adactin_LoginPage;
import com.pomclass.Adactin_SelectHotel;
import com.pomclass.Book_HotelPage;
import com.pomclass.Booking_ConfirmationPage;
import com.pomclass.Search_HotelPage;

public class Adactin_Test_Runner extends Adactin_BaseClass {
	
	public static WebDriver driver=browserLaunch("chrome");
	
	public static  Adactin_Page_Object_Manager pom=new  Adactin_Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {

		String url = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		
		launchUrl(url);

		String user_name = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getUser_name();
		inputValues(pom.getInstanceAL().getUsername(), user_name);
		
		String password = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		inputValues(pom.getInstanceAL().getPassword(), password);
		
		clickOnElement(pom.getInstanceAL().getLogin());

		implicitlyWait(30);
		
		String location = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getLocation();
		singleDropDown_byvalue(pom.getInstanceSH().getLocation(), location);
		
		String hotels = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getHotels();
		singleDropDown_byvalue(pom.getInstanceSH().getHotels(), hotels);
		
		String roomType = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getRoomType();
		singleDropDown_byvalue(pom.getInstanceSH().getRoom_type(), roomType);
		
		String no_Of_Rooms = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getNo_Of_Rooms();
		singleDropDown_byvisibleText(pom.getInstanceSH().getNumber_of_rooms(), no_Of_Rooms);
		
		String checkIn = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckIn();
		inputValues(pom.getInstanceSH().getCheck_in(), checkIn);
		
		String checkOut = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckOut();
		inputValues(pom.getInstanceSH().getCheck_out(), checkOut);
		
		String adults_Room = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getAdults_Room();
		singleDropDown_byvisibleText(pom.getInstanceSH().getAdults_room(), adults_Room);
		
		String children_Room = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getChildren_Room();
		singleDropDown_byvisibleText(pom.getInstanceSH().getChildren_room(), children_Room);
		
		clickOnElement(pom.getInstanceSH().getSearch());
		
		
		clickOnElement(pom.getInstanceAS().getSelect_hotel());

		clickOnElement(pom.getInstanceAS().getContinue_btn());

		String first_Name = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirst_Name();
		inputValues(pom.getInstanceBH().getFirst_name(), first_Name);

		String last_Name = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getLast_Name();
		inputValues(pom.getInstanceBH().getLast_name(), last_Name);

		String billing_Address = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getBilling_Address();
		inputValues(pom.getInstanceBH().getBilling_address(),billing_Address);

		String creditCard_No = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getCreditCard_No();
		inputValues(pom.getInstanceBH().getCredit_card_no(), creditCard_No);

		String creditCard_Type = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getCreditCard_Type();
		singleDropDown_byvisibleText(pom.getInstanceBH().getCredit_card_type(), creditCard_Type);

		String expiry_Month = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpiry_Month();
		singleDropDown_byvisibleText(pom.getInstanceBH().getExpiry_month(), "March");

		String expiry_Year = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpiry_Year();
		singleDropDown_byvisibleText(pom.getInstanceBH().getExpiry_year(), expiry_Year);

		String cvv_No = Adactin_File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvv_No();
		inputValues(pom.getInstanceBH().getCvv_no(), cvv_No);

		clickOnElement(pom.getInstanceBH().getBook_btn());

		implicitlyWait(30);

		
		clickOnElement(pom.getInstanceBC().getItinenary());

		screenShot("C:\\Users\\Ganesh\\eclipse-workspace\\Maven_Project\\Screenshot\\adactinhotel.png");

	}

}
