package webelement;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class captha {

	private WebDriver driver; 
	private String baseUrl;
	@BeforeSuite
	public void setUp() throws Exception{
		// Selenium version 3 beta releases require system property set up
		System.setProperty("webdriver.chrome.driver","D:\\jarfiles\\chromedriver.exe");
		// Create a new instance for the class FirefoxDriver
		// that implements WebDriver interface
		driver = new ChromeDriver();
		// Implicit wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// Assign the URL to be invoked to a String variable
		
	}
	
	@Test
	public void testPageTitle() throws Exception{
		Thread.sleep(2000);
		// Open baseUrl in Firefox browser window
		driver.get("https://www.in.ckgs.us//myaccount/");
		// Locate 'Current Passport Number' text box by cssSelector: tag and name attribute
		WebElement passportNo = driver.findElement(By.cssSelector("input[name='currentPassportNo']"));
		// Clear the default placeholder or any value present
		passportNo.clear();
		// Enter/type the value to the text box
		passportNo.sendKeys("123456789");
		//prompting user to enter captcha			
		String captchaVal = JOptionPane.showInputDialog("Please enter the captcha value:");
		//Type the entered captcha to the text box
driver.findElement(By.id("recaptcha_response_field")).sendKeys(captchaVal);			
	}
	
	 @AfterSuite
	  public void tearDown() throws Exception{
		// Close the Firefox browser
		driver.close();
	
}}
