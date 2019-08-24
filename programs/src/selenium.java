import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class selenium {
	WebDriver driver;
	@BeforeMethod
	public void login(){
		driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/hrm/login.php");
		
	}
	

}
