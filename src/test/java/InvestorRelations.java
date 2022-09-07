import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvestorRelations {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Desktop\\chromedriver2\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.carlsberggroup.com/investor-relations/shares/investment-calculator/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
	WebElement divcal=driver.findElement(By.xpath("(//a[@role='tab'])[4]"));
	divcal.click();
	System.out.println("Hello");
	//button to open calendar

    WebElement selectDate = driver.findElement(By.xpath("//div[@class='EurolandTools-CommonObjects-Calendar-Selection'])[1]"));
    
selectDate.click();


//button to click in center of calendar header

WebElement midLink = driver.findElement(By.xpath("//span[text()='May 2017']"));
//button to move next in calendar

WebElement nextLink = driver.findElement(By.xpath("(//*[@class='EurolandTools-CommonObjects-Calendar-Calendar-NavigatorStructTable']/child::tr/td/following-sibling::td[@class='EurolandTools-CommonObjects-Calendar-Calendar-Navigator-NextButtons']/span[@class='EurolandTools-CommonObjects-Calendar-Button-VisualButton EurolandTools-CommonObjects-Calendar-Navigator-Button'])[5]"));


//button to move previous month in calendar

WebElement previousLink = driver.findElement(By.xpath("(//*[@class='EurolandTools-CommonObjects-Calendar-Calendar-NavigatorStructTable']/child::tr/td/span)[18]")); 

    //Split the date time to get only the date part
String dt= "12/7/2017";
    String date_dd_MM_yyyy[] = (dt.split(" ")[0]).split("/");

    //get the year difference between current year and year to set in calander

    int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2])- Calendar.getInstance().get(Calendar.YEAR);

    midLink.click();

    if(yearDiff!=0){

        //if you have to move next year

        if(yearDiff>0){

            for(int i=0;i< yearDiff;i++){

                System.out.println("Year Diff->"+i);

                nextLink.click();

            }

        }

        //if you have to move previous year

        else if(yearDiff<0){

            for(int i=0;i< (yearDiff*(-1));i++){

                System.out.println("Year Diff->"+i);

                previousLink.click();

            }

        }

    }
    
    Thread.sleep(1000);

    //Get all months from calendar to select correct one

    List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
    
    list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1])-1).click();
    
    Thread.sleep(1000);

    //get all dates from calendar to select correct one

    List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
    
    list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0])-1).click();
    
    ///FOR TIME

    WebElement selectTime = driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_timeview']"));

    //click time picker button

    selectTime.click();

    //get list of times

    List<WebElement> allTime = driver.findElements(By.xpath("//div[@data-role='popup'][contains(@style,'display: block')]//ul//li[@role='option']"));
  
    dateTime = dateTime.split(" ")[1]+" "+dateTime.split(" ")[2];

 //select correct time

    for (WebElement webElement : allTime) {

        if(webElement.getText().equalsIgnoreCase(dateTime))

        {

            webElement.click();

        }

    }

}

	
     WebElement data = driver.findElement(By.xpath("(//div[@class='EurolandTools-CommonObjects-Calendar-Selection'])[1]")); 
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	
//	js.executeScript("arguments[0].scrollIntoView();", data);
//	js.executeScript("arguments[0].click()",data);
	String dt= "12/7/2017";
     data.click();
	WebElement sdate = driver.findElement(By.xpath("(//span[text()='27'])[1]))"));
	
	js.executeScript("arguments[0].click()",sdate);
//	sdate.click();
	
	
	

}

}
