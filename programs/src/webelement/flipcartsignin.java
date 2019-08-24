package webelement;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class flipcartsignin {
	WebDriver driver;
	JavascriptExecutor js;
	@BeforeSuite
	public void loginflip(){
		System.setProperty("webdriver.chrome.driver","D:\\jarfiles\\chromedriver.exe");
            driver =new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
            driver.navigate().to("https://www.flipkart.com");
            
            if(driver.getTitle().equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!"))
            		{
            	System.out.println("title presaernt");
            }
           int s=driver.hashCode();
           System.out.println(s);
            driver.findElement(By.xpath("(//button)[2]")).click();

	}
	@Test
	public void scroll() throws InterruptedException, AWTException{
		js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,750)");
		Thread.sleep(5000);
		js.executeAsyncScript("scroll(750,0)");
	
		/*List<WebElement> li=driver.findElements(By.tagName("iframe"));
		Iterator i=li.iterator();
		System.out.println(i);
		while(i.hasNext()){
			WebElement e=(WebElement)i.next();
			String s1=e.getAttribute("id");
			System.out.println(s1);
			
			String s2=e.getAttribute("ClassName");
			System.out.println(s2);}*/
		/*Thread.sleep(5000);
		Actions a=new Actions(driver);
		WebElement e3=driver.findElement(By.xpath("//span[text()='Electronics']"));
		Thread.sleep(3000);
		a.moveToElement(e3).build().perform();*/
		Robot r=new Robot();
		//WebDriverWait wait=new WebDriverWait(driver,35);
		List<WebElement> li=driver.findElements(By.xpath("(//ul)[2]/li"));
	
		
		Iterator i3=li.iterator();
		while(i3.hasNext()){
			String f=(String)i3.next();
			System.out.println(f.length());
		}
		}
		
		
		
	}


