package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Facebook_ConfigurationReader {

	public static Properties p;

	public Facebook_ConfigurationReader() throws Throwable {
		File f=new File("C:\\Users\\Ganesh\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\Facebook_Configuration.properties" );
		FileInputStream fis=new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getUrl() throws Throwable {
		String url = p.getProperty("url");
		return url;
	}
	public String getFirst_name() throws Throwable {
		String fname = p.getProperty("First_name");
		return fname;
	}
	public String getSur_name() throws Throwable {
		String sname = p.getProperty("Sur_name");
		return sname;
	}
	public String getMobile_no() throws Throwable {
		String mobile_no = p.getProperty("Mobile_no");
		return mobile_no;
	}
	public String getPassword() throws Throwable {
		String password = p.getProperty("Password");
		return password;
	}
	public String getDay() throws Throwable {
		String day = p.getProperty("Day");
		return day;
	}
	public String getMonth() throws Throwable {
		String month = p.getProperty("Month");
		return month;
	}
	public String getYear() throws Throwable {
		String year = p.getProperty("Year");
		return year;
	}
	
	
	
	



}
