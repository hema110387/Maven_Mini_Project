import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Investment {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Desktop\\chromedriver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.carlsberggroup.com/investor-relations/shares/investment-calculator/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement accept = driver.findElement(By.xpath("//button[text()='Allow all']"));
		accept.click();
		WebElement y1 = driver.findElement(By.name("cb_age_year_1"));
		y1.sendKeys("1");
		WebElement y2 = driver.findElement(By.name("cb_age_year_2"));
		y2.sendKeys("9");
		WebElement y3 = driver.findElement(By.name("cb_age_year_3"));
		y3.sendKeys("8");
		WebElement y4 = driver.findElement(By.name("cb_age_year_4"));
		y4.sendKeys("7");
		WebElement checkbox = driver.findElement(By.xpath("//label[@for='checkbox']"));
		checkbox.click();
		WebElement enter = driver.findElement(By.id("cbgAge-submit"));
		enter.click();
		
		Actions ac=new Actions(driver);
		WebElement investorRelations = driver.findElement(By.xpath("//li[@class='nav__item'][6]"));
		ac.moveToElement(investorRelations).build().perform(); 
		
		WebElement ical = driver.findElement(By.xpath("(//a[text()='Investment Calculator'])[2]"));
		ical.click();
		
		driver.switchTo().frame(0);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Dividend Calculator']")).click();
		WebElement calender = driver.findElement(By.xpath("(//table[@class='EurolandTools-CommonObjects-Calendar-Month-Table' and @role='presentation'])[1]"));
		List<WebElement> calRows = calender.findElements(By.tagName("tr"));
		System.out.println(calRows.get(1).getText());
		
//	    String year="2017";
//		String month="July";
//		String date="18";
	
		
//		Thread.sleep(3000);
//		WebElement selectDate = driver.findElement(By.xpath("(//span[@class='EurolandTools-CommonObjects-Calendar-CalendarIcon'])[1]"));
//		selectDate.click();
//		
////		WebElement date = driver.findElement(By.xpath("//button[text()='July 8 2017, saturday']"));
//WebElement pre = driver.findElement(By.xpath("(//span[@role='presentation'])[142]"));		
//		pre.click();
//     
//		WebElement date = driver.findElement(By.xpath("(//span[@class='EurolandTools-CommonObjects-Calendar-Button-VisualButton EurolandTools-CommonObjects-Calendar-Month-DayButton EurolandTools-CommonObjects-Calendar-Month-SelectedDay'])[2]"));
////		WebElement date = driver.findElement(By.xpath("(//span[text()='10'])[4]"));
//		
//		date.click();
////        while(true) {
////        	String monthyear=driver.findElement(By.xpath("//span[text()='July 2017']")).getText();
////        	
////        	String arr[]=monthyear.split(" ");
////        	String mon=arr[0];
////        	String yr=arr[1];
////        	
////        	if(mon.equalsIgnoreCase(month)&&yr.equals(year))
////        		break;
////			else {
////				 driver.findElement(By.xpath("(//span[@class='EurolandTools-CommonObjects-Calendar-Button-VisualButton EurolandTools-CommonObjects-Calendar-Navigator-Button'])[11]")).click();
////			}
////        	
////        	
////        	
////        	List<WebElement> allDates = driver.findElements(By.xpath("//*[@id=\"EurolandTools-CommonObjects-Calendar-1-CalendarPanelID\"]/div[1]"));
////        	for(WebElement ele : allDates)
////        	{
////        		String dt=ele.getText();
////        		if(dt.equals(date)) {
////        			ele.click();
////        			break;
////        		}
////        	}
//        	
//        	
//        	
//           Thread.sleep(3000);      	
//           driver.findElement(By.xpath("//input[@class='EurolandTools-TotalReturnAndDividends-CalculatorTab-Input']")).sendKeys("4500000");
//
//           driver.findElement(By.xpath("//button[text()='Calculate']")).click();
//           WebElement divedent = driver.findElement(By.xpath("//td[text()='Investment:']"));
//           divedent.click();
//
//           JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		   js.executeScript("arguments[0].scrollIntoView();", divedent);
//			
//			
//		   TakesScreenshot ts= (TakesScreenshot) driver;
//		   File  src = ts.getScreenshotAs(OutputType .FILE);
//		   File dest=new File("C:\\Users\\Ganesh\\eclipse-workspace\\Maven_Project\\Screenshot\\Investment.png");
//		   FileUtils.copyFile(src, dest);


			}
        	
        }
        
//	}

