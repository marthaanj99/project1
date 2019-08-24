package webelement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class contextclick {
@Test
public void con() throws InterruptedException{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\jarfiles\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Actions act=new Actions(driver);
	//Alert a=driver.switchTo().alert();
	//System.out.println(a.getText());
	driver.findElement(By.xpath("//a[contains(text(),'No, thanks')]")).click();
	Thread.sleep(3000);
WebElement ed=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
ed.click();
if(ed.isDisplayed()&&ed.isEnabled()){
	ed.sendKeys("qa");
	ed.sendKeys(Keys.ENTER);
	
	WebElement el=driver.findElement(By.xpath("//div[contains(text(),'Quality assurance - Wikipedia')]"));
	act.contextClick(el).sendKeys(Keys.ENTER).perform();
	
}

}
}
