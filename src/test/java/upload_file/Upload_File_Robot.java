package upload_file;


	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

import com.Maven_Project.Adactin_BaseClass;
import com.adactin.sdp.Adactin_Page_Object_Manager;
import com.helper.Adactin_File_Reader_Manager;

	public class Upload_File_Robot {
		
		String URL = "application URL";
		
		@Test
		public void testUpload() throws InterruptedException
		{
			WebDriver  driver = new FirefoxDriver();
			driver.get(URL);
			WebElement element = driver.findElement(By.name("uploadfile"));
			element.click();
			uploadFile("path to the file");
			Thread.sleep(2000);
		}
		
		/**
	     * This method will set any parameter string to the system's clipboard.
	     */
		public static void setClipboardData(String string) {
			//StringSelection is a class that can be used for copy and paste operations.
			   StringSelection stringSelection = new StringSelection(string);
			   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			}
		
		public static void uploadFile(String fileLocation) {
	        try {
	        	//Setting clipboard with file location
	            setClipboardData(fileLocation);
	            //native key strokes for CTRL, V and ENTER keys
	            Robot robot = new Robot();
		
	            robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);
	        } catch (Exception exp) {
	        	exp.printStackTrace();
	        }
	    }
	}

