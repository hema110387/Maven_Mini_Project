package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Address_Page;
import com.pomclass.Dresses_Page;
import com.pomclass.Home_Page;
import com.pomclass.Login_Page;
import com.pomclass.OrderConfirmation;
import com.pomclass.Order_Page;
import com.pomclass.Payment_Method;
import com.pomclass.Shipping_Page;
import com.pomclass.Summary_page;

public class Page_Object_Manager {

	public WebDriver driver;

	private Home_Page hp;
	private Login_Page lp;
	private Dresses_Page dp;
	private Order_Page op;
	private Summary_page sp;
	private Address_Page ap;
	private Shipping_Page shp;
	private Payment_Method pm;
	private OrderConfirmation oc;

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;
	}

	public Home_Page getInstanceHp() {
		if (hp == null) {
			hp = new Home_Page(driver);
		}
		return hp;
	}

	public Login_Page getInstanceLp() {
		if (lp == null) {
			lp = new Login_Page(driver);
		}
		return lp;
	}

	public Dresses_Page getInstanceDp() {
		if (dp == null) {
			dp = new Dresses_Page(driver);
		}
		return dp;
	}

	public Order_Page getInstanceOp() {
		if (op == null) {
			op = new Order_Page(driver);
		}
		return op;
	}

	public Summary_page getInstanceSp() {
		if (sp == null) {
			sp = new Summary_page(driver);
		}
		return sp;
	}

	public Address_Page getInstanceAp() {
		if (ap == null) {
			ap = new Address_Page(driver);
		}
		return ap;
	}

	public Shipping_Page getInstanceSHP() {
		if (shp == null) {
			shp = new Shipping_Page(driver);
		}
		return shp;
	}

	public Payment_Method getInstancePM() {
		if (pm == null) {
			pm = new Payment_Method(driver);
		}
		return pm;
	}

	public OrderConfirmation getInstanceOC() {
		if (oc == null) {
			oc = new OrderConfirmation(driver);
		}
		return oc;
	}

}
