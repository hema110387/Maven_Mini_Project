package com.myntra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Myntra_Project {
	WebDriver driver;
	
	@BeforeMethod
		private void browserSetUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Desktop\\ChromeDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
    }

	
	
    @Test
	public void getProductPrice() {

	driver.get("https://www.myntra.com/men-tshirts?f=Categories%3ATshirts");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	List<WebElement> product_price = driver.findElements(By.xpath("//li[@class='product-base']//descendant::div[@class='product-price']"));
	for (WebElement price : product_price) {
		String range = price.getText();
		System.out.println(range);
		}
    }
	
    
    @Parameters({"given_price"})
	@Test
	public void get_ProductName(int given_price) {
 
	//int given_price=494;
	driver.get("https://www.myntra.com/men-tshirts?f=Categories%3ATshirts&rf=Price%3A179.0_3172.0_179.0%20TO%203172.0");
	List<WebElement> pdiscount = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
	for (WebElement pprice : pdiscount) {
		
		String price = pprice.getText().replace("Rs. ", "");
		System.out.println(price);
		if(Integer.valueOf(price)==given_price) {
			WebElement pName = driver.findElement(By.xpath("//ancestor::div[@class='product-price']//preceding-sibling::h3"));
			String name = pName.getText();
			System.out.println(name);
		}
	}
		
}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

}
