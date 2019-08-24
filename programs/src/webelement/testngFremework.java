package webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class testngFremework {
public static  WebDriver driver;
	@BeforeMethod
	public void login(){
		System.setProperty("webdriver.chrome.driver","D:\\jarfiles\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
}
