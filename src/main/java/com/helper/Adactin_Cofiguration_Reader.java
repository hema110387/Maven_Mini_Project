package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Adactin_Cofiguration_Reader {

	
	public static Properties p;

	public Adactin_Cofiguration_Reader() throws Throwable {
		
		File f=new File("C:\\Users\\Ganesh\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\Adactin_Configuration.properties" );
		FileInputStream fis=new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getUrl() throws Throwable {
		String url = p.getProperty("url");
		return url;
	}
	public String getUser_name() throws Throwable {
		String uname = p.getProperty("username");
		return uname;
	}
	public String getPassword() throws Throwable {
		String pwd = p.getProperty("password");
		return pwd;
	}
	public String getLocation() throws Throwable {
		String loc = p.getProperty("location");
		return loc;
	}
	public String getHotels() throws Throwable {
		String hotels = p.getProperty("hotels");
		return hotels;
	}
	public String getRoomType() throws Throwable {
		String room_type = p.getProperty("room_type");
		return room_type;
	}
	public String getNo_Of_Rooms() throws Throwable {
		String no_rooms = p.getProperty("number_of_rooms");
		return no_rooms;
	}
	public String getCheckIn() throws Throwable {
		String checkin = p.getProperty("check_in");
		return checkin;
	}
	public String getCheckOut() throws Throwable {
		String checkout = p.getProperty("check_out");
		return checkout;
	}
	
	public String getAdults_Room() throws Throwable {
		String adult_room = p.getProperty("adults_room");
		return adult_room;
	}
	public String getChildren_Room() throws Throwable {
		String children_room = p.getProperty("children_room");
		return children_room;
	}
	public String getFirst_Name() throws Throwable {
		String first_name = p.getProperty("first_name");
		return first_name;
	}
	public String getLast_Name() throws Throwable {
		String last_name = p.getProperty("last_name");
		return last_name;
	}
	public String getBilling_Address() throws Throwable {
		String billing_address = p.getProperty("billing_address");
		return billing_address;
	}
	public String getCreditCard_No() throws Throwable {
		String credit_no = p.getProperty("credit_card_no");
		return credit_no;
		
	}
	
	public String getCreditCard_Type() throws Throwable {
		String credit_type = p.getProperty("credit_card_type");
		return credit_type;
	}
		
	public String getExpiry_Month() throws Throwable {
		String expiry_month = p.getProperty("expiry_month");
		return expiry_month;
	}
	public String getExpiry_Year() throws Throwable {
		String expiry_year = p.getProperty("expiry_year");
		return expiry_year;
	}
	public String getCvv_No() throws Throwable {
		String cvv_no = p.getProperty("cvv_no");
		return cvv_no;
	}	
		
	
}
