package com.Maven_Project;

import org.openqa.selenium.WebDriver;

import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class Test_Runner extends BaseClass {
	public static WebDriver driver = browserLaunch("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);
		
		implicitlyWait(50);

		clickOnElement(pom.getInstanceHp().getSignin());
		
		String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getEmail();
		inputValues(pom.getInstanceLp().getEmail(), email);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		inputValues(pom.getInstanceLp().getPassword(), password);
		
		clickOnElement(pom.getInstanceLp().getSignin());

		clickOnElement(pom.getInstanceDp().getDresses());
		clickOnElement(pom.getInstanceDp().getPrinted_dress());

		singleFrame_index(0);

		clickOnElement(pom.getInstanceOp().getAdd_quantity());
		clickOnElement(pom.getInstanceOp().getAdd_to_cart());

		defaultContent();

		clickOnElement(pom.getInstanceOp().getProceed_to_checkout());

		clickOnElement(pom.getInstanceSp().getProceed_to_checkout1());

		clickOnElement(pom.getInstanceAp().getProceed_to_checkout2());

		clickOnElement(pom.getInstanceSHP().getClick_button());
		clickOnElement(pom.getInstanceSHP().getProceed_to_checkout3());

		clickOnElement(pom.getInstancePM().getBank_wire());

		clickOnElement(pom.getInstanceOC().getConfirm_order());

		screenShot("C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Ex\\Screenshot\\payment.png");
	}
}
