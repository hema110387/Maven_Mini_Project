package Facebook_sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Facebook_AccountPage;
import com.pomclass.Facebook_LoginPage;

public class Facebook_Page_Object_Manager {

	public WebDriver driver;
	private Facebook_LoginPage fl;
	private Facebook_AccountPage fa;
	
	public Facebook_Page_Object_Manager(WebDriver driver2) {
		
		this.driver=driver2;
	}

	public Facebook_LoginPage getInstanceFL() {
		
		if(fl==null) {
		 fl=new Facebook_LoginPage(driver);
		}
		return fl;
	}
	
	public Facebook_AccountPage getinstanceFA() {
		if(fa==null) {
		 fa=new Facebook_AccountPage(driver);
		}
		return fa;
	}
	
	
	
	
}
