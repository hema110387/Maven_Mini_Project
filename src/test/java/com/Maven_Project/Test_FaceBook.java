package com.Maven_Project;

import org.openqa.selenium.WebDriver;

import com.helper.Facebook_File_Reader_Manager;

import Facebook_sdp.Facebook_Page_Object_Manager;

public class Test_FaceBook extends BaseClassFaceBook{

	public static WebDriver driver=browserLaunch("chrome");
	
	public  static  Facebook_Page_Object_Manager pom =new Facebook_Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {

		
		String url = Facebook_File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);

		
		clickOnElement(pom.getInstanceFL().getButton());

		implicitlyWait(30);
		
		String first_name = Facebook_File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirst_name();
		inputValues(pom.getinstanceFA().getFirst_name(),first_name);

		String sur_name = Facebook_File_Reader_Manager.getInstanceFRM().getInstanceCR().getSur_name();
		inputValues(pom.getinstanceFA().getSur_name(),sur_name);

		String mobile_no = Facebook_File_Reader_Manager.getInstanceFRM().getInstanceCR().getMobile_no();
		inputValues(pom.getinstanceFA().getMobile_no(),mobile_no);

		String password = Facebook_File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		inputValues(pom.getinstanceFA().getPassword(),password);

		String day = Facebook_File_Reader_Manager.getInstanceFRM().getInstanceCR().getDay();
		singleDropDown_byvisibleText(pom.getinstanceFA().getDay(),day);

		String month = Facebook_File_Reader_Manager.getInstanceFRM().getInstanceCR().getMonth();
		singleDropDown_byvisibleText(pom.getinstanceFA().getMonth(),month);

		String year = Facebook_File_Reader_Manager.getInstanceFRM().getInstanceCR().getYear();
		singleDropDown_byvisibleText(pom.getinstanceFA().getYear(),year);

		clickOnElement(pom.getinstanceFA().getBtn());

	}
}