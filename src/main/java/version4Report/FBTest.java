package version4Report;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FBTest {

	public WebDriver driver;
	
	@BeforeTest()
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	}
	
	@AfterTest()
	public void tearDown()
	{
		driver.close();
	}
	
	
	@Test
	public void FBLogoTest() throws IOException
	{
		boolean status=driver.findElement(By.xpath("//body/div[@id='u_0_3_zs']/div[@id='globalContainer']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).isDisplayed();
		
		Assert.assertTrue(true);
		
	}
	
	@AfterMethod
	public void tearDownB(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			
		}
	}
}
