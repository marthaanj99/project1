

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class screenshot {
	private static final String FileUtils = null;
	public WebDriver driver;
@BeforeSuite
public void openpage(){
	
	System.setProperty("webdriver.chrome.driver","D:\\jarfiles\\chromedriver.exe");
	driver=new ChromeDriver();
}
@Test
public void  screenshoot() throws IOException{
	driver.get("http://apps.qaplanet.in/hrm/login.php");
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(src,new File("D://aa.png"));
	FileOutputStream fo=new FileOutputStream("D://aaa1235.xlsx");
	

XSSFWorkbook bo=new XSSFWorkbook();
XSSFSheet shet=bo.createSheet("google");

XSSFRow r=shet.createRow(0);
r.createCell(0).setCellValue("qaplanet1");
r.createCell(1).setCellValue("lab1");
FileInputStream fi=new FileInputStream("D://aaa1235.xlsx");
String sg=r.getCell(0).getStringCellValue();
System.out.println(sg);
String sg1=r.getCell(1).getStringCellValue();
driver.findElement(By.xpath("//table/descendant::input[1]")).sendKeys(sg);
driver.findElement(By.xpath("//table/descendant::input[2]")).sendKeys(sg1);
driver.findElement(By.xpath("//table/descendant::input[3]")).click();

bo.write(fo);
bo.close();

}}
