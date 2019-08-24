package webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {
	 public WebDriver driver;
	public void log(){
	
	System.setProperty("webdriver.chrome.driver","D:\\jarfiles\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://apps.qaplanet.in/hrm/login.php");
	}
	

}
