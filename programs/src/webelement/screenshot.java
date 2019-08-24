package webelement;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class screenshot {
/*@BeforeSuite
public void sc(){
	
	driver.navigate().to("https://www.flipkart.com/");
	StringSelection ss=new StringSelection(null);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,);
	
	
}*/
@Test(invocationCount=2,invocationTimeOut=9900)
public void writedatatoexel() throws IOException{
	
	XSSFWorkbook wb=new XSSFWorkbook();
	XSSFSheet s=wb.createSheet("sh1");
	XSSFRow r1=s.createRow(0);
	XSSFCell c1=r1.createCell(0);
	c1.setCellValue("qaplanet1");
	r1.createCell(1).setCellValue("lab1");
	FileOutputStream fo=new FileOutputStream("D://anj9.xlsx");
	wb.write(fo);
	FileInputStream fi=new FileInputStream("D://anj9.xlsx");
	XSSFWorkbook aa=new XSSFWorkbook(fi);
	XSSFSheet ss=aa.getSheet("sh1");
	XSSFRow r5=ss.getRow(0);
	for(int i=0;i<r5.getLastCellNum();i++){
		XSSFCell c5=r5.getCell(0);
		String g=c5.getStringCellValue();
		System.out.println(g);
		XSSFCell c11=r5.getCell(1);
		String g1=c11.getStringCellValue();
		System.out.println(g1);
		System.setProperty("webdriver.chrome.driver","D:\\jarfiles\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/hrm/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(g);
		driver.findElement(By.name("txtPassword")).sendKeys(g1);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
	}
	wb.close();
	
}
}
