package webelement;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class flipcartlogin {
	WebDriver driver;
@Test
public void loginflipc() throws InterruptedException, IOException{
	System.setProperty("webdriver.chrome.driver","D:\\jarfiles\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
	List<WebElement> ll=driver.findElements(By.xpath("//div[@class='zi6sUf']"));
	Iterator<WebElement> ie=ll.iterator();
	while(ie.hasNext()){
		System.out.println(ie.next().getText());
	}
	//Thread.sleep(5000);
	WebDriverWait wait=(WebDriverWait) new WebDriverWait(driver,30).ignoring(StaleElementReferenceException.class);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']")));
	WebElement ele=driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
	Actions a=new Actions(driver);
	WebElement em=driver.findElement(By.xpath("//a[contains(text(),'Mi')]"));
	a.moveToElement(ele).perform();
	Thread.sleep(3000);
	em.click();
	List<WebElement> cli=driver.findElements(By.xpath("//nav[@class='_1ypTlJ']/a"));
	//Iterator<WebElement> ne=cli.iterator();
	//while(ne.hasNext())

	XSSFWorkbook bo=new XSSFWorkbook();
	XSSFSheet s=bo.getSheet("Sheet1");
	FileOutputStream fo=new FileOutputStream("D:\\Book12.xlsx");
	
	
int productcount=0;
int row=0;
int col=0;
	for(int i=0;i<cli.size()-1;i++)
	{
		
		WebDriverWait wait1=  (WebDriverWait) new WebDriverWait(
	            driver, 20).ignoring(StaleElementReferenceException.class);
		
		System.out.println(cli.get(i).getText());
		
		//String s=ne.next().getText();
		Thread.sleep(5000);
		//store product element
		
		/*
		Iterator<WebElement> lp=ep.iterator();
		while(lp.hasNext()){
			System.out.println(lp.next().getText());
			WebDriverWait wait1=  (WebDriverWait) new WebDriverWait(
		            driver, 20).ignoring(StaleElementReferenceException.class);
			wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='_1-2Iqu row']")));
	*/
		/*for(int j=0;j<productelement.size()-1;j++){
		WebDriverWait wait1=  (WebDriverWait) new WebDriverWait(
	            driver, 20).ignoring(StaleElementReferenceException.class);
		//System.out.println(productelement.get(j).getText());
		
		*/
		
		//add product count to pages productelement
		List<WebElement> productelement=driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		productcount=productcount+productelement.size();
		System.out.println(productcount);
		String valuee=driver.findElement(By.cssSelector("h1[class='_2yAnYN']")).getText();
		System.out.println(valuee);
		Thread.sleep(3000);

	//for(int j=0;j<=productcount;j++){
		List<WebElement> emo=driver.findElements(By.cssSelector("div[class='_3wU53n']"));
		Iterator<WebElement> imo=emo.iterator();
		List<WebElement> eprice=driver.findElements(By.cssSelector("_1vC4OE _2rQ-NK"));
		Iterator<WebElement> ep=eprice.iterator();
		while(imo.hasNext()&&ep.hasNext()){
			String s1=imo.next().getText();
			XSSFRow r1=s.createRow(row++);
			r1.createCell(0).setCellValue(s1);
			String s2=ep.next().getText();
			System.out.println(s2);
			r1.createCell(1).setCellValue(s2);
			
		
	}

		
		

		
		
		
	}
	s.autoSizeColumn(0);
    s.autoSizeColumn(1);
		bo.write(fo);
		bo.close();
		
		}}
		
	
	
	


