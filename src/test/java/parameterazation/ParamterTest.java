package parameterazation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {
	
	
	WebDriver driver;
	
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//	@Parameters("browser")
//	@Test
//	public void getInput(String uname)
//	{
//		System.out.println(uname);
//	}
	
	@Parameters("browser")
	@Test
	public void getInput(String a)
	{
		System.out.println(a);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	

}
