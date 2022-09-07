
	import java.io.File;
	import java.time.Duration;
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
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;

	public class Investment_project {
		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Desktop\\ChromeDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.carlsberggroup.com/investor-relations/shares/investment-calculator/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			WebElement allow = driver.findElement(By.xpath("//button[text()='Allow all']"));
			js.executeScript("arguments[0].click()", allow);
			driver.findElement(By.name("cb_age_year_1")).sendKeys("1");
			driver.findElement(By.name("cb_age_year_2")).sendKeys("9");
			driver.findElement(By.name("cb_age_year_3")).sendKeys("8");
			driver.findElement(By.name("cb_age_year_4")).sendKeys("7");
			driver.findElement(By.xpath("//label[@for='checkbox']")).click();
			driver.findElement(By.id("cbgAge-submit")).click();
			
			Actions ac=new Actions(driver);
			WebElement investorRelations = driver.findElement(By.xpath("//li[@class='nav__item'][6]"));
			ac.moveToElement(investorRelations).build().perform(); 
			
			driver.findElement(By.xpath("(//a[text()='Investment Calculator'])[2]")).click();
			
			
			driver.switchTo().frame(0);
			WebElement DivCalender = driver.findElement(By.xpath("//a[text()='Dividend Calculator']"));
			js.executeScript("arguments[0].click()", DivCalender);
			driver.findElement(By.xpath("//span[@class='EurolandTools-CommonObjects-Calendar-CalendarIcon']")).click();
			WebElement yearTab = driver.findElement(By.xpath("(//table[@class='EurolandTools-CommonObjects-Calendar-Calendar-NavigatorStructTable'])[5]"));
			WebElement yearRow = yearTab.findElement(By.tagName("tr"));
			List<WebElement> yeardata = yearRow.findElements(By.tagName("td"));
			WebElement next = yeardata.get(2);
			next.findElement(By.xpath("(//span[@class='EurolandTools-CommonObjects-Calendar-Button-VisualButton EurolandTools-CommonObjects-Calendar-Navigator-Button'])[11]")).click();
			
			
			WebElement calender = driver.findElement(By.xpath("(//table[@class='EurolandTools-CommonObjects-Calendar-Month-Table' and @role='presentation'])[6]"));
			List<WebElement> calRows = calender.findElements(By.tagName("tr"));
			WebElement FourthRow = calRows.get(3);
			List<WebElement> dateSelect = FourthRow.findElements(By.tagName("td"));
			dateSelect.get(6).click();

//		    String year="2017";
//			String month="July";
//			String date="18";
		
			
//			Thread.sleep(3000);
//			WebElement selectDate = driver.findElement(By.xpath("(//span[@class='EurolandTools-CommonObjects-Calendar-CalendarIcon'])[1]"));
//			selectDate.click();
//			
////			WebElement date = driver.findElement(By.xpath("//button[text()='July 8 2017, saturday']"));
	//WebElement pre = driver.findElement(By.xpath("(//span[@role='presentation'])[142]"));		
//			pre.click();
//	     
//			WebElement date = driver.findElement(By.xpath("(//span[@class='EurolandTools-CommonObjects-Calendar-Button-VisualButton EurolandTools-CommonObjects-Calendar-Month-DayButton EurolandTools-CommonObjects-Calendar-Month-SelectedDay'])[2]"));
////			WebElement date = driver.findElement(By.xpath("(//span[text()='10'])[4]"));
//			
//			date.click();
////	        while(true) {
////	        	String monthyear=driver.findElement(By.xpath("//span[text()='July 2017']")).getText();
////	        	
////	        	String arr[]=monthyear.split(" ");
////	        	String mon=arr[0];
////	        	String yr=arr[1];
////	        	
////	        	if(mon.equalsIgnoreCase(month)&&yr.equals(year))
////	        		break;
////				else {
////					 driver.findElement(By.xpath("(//span[@class='EurolandTools-CommonObjects-Calendar-Button-VisualButton EurolandTools-CommonObjects-Calendar-Navigator-Button'])[11]")).click();
////				}
////	        	
////	        	
////	        	
////	        	List<WebElement> allDates = driver.findElements(By.xpath("//*[@id=\"EurolandTools-CommonObjects-Calendar-1-CalendarPanelID\"]/div[1]"));
////	        	for(WebElement ele : allDates)
////	        	{
////	        		String dt=ele.getText();
////	        		if(dt.equals(date)) {
////	        			ele.click();
////	        			break;
////	        		}
////	        	}
//	        	
//	        	
//	        	
//	           Thread.sleep(3000);      	
           driver.findElement(By.xpath("//input[@class='EurolandTools-TotalReturnAndDividends-CalculatorTab-Input']")).sendKeys("4500000");
	
           driver.findElement(By.xpath("//button[text()='Calculate']")).click();
	           WebElement divedent = driver.findElement(By.xpath("//td[text()='Investment:']"));
	           divedent.click();
	
	
			   js.executeScript("arguments[0].scrollIntoView();", divedent);
//				
//				
			   TakesScreenshot ts= (TakesScreenshot) driver;
	   File  src = ts.getScreenshotAs(OutputType .FILE);
	   File dest=new File("C:\\Users\\Ganesh\\eclipse-workspace\\Maven_Project\\Screenshot\\Investment.png");
		   FileUtils.copyFile(src, dest);


				}
	        	
	        }
	        
//		}

