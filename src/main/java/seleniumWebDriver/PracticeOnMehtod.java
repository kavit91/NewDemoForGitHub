package seleniumWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticeOnMehtod {

	
		@Test
		public void practice()
		{
			System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
			
			
			driver.get("https://timesofindia.indiatimes.com/");
//			driver.switchTo().alert().dismiss();
			List<WebElement> test=driver.findElements(By.xpath("//span[contains(text(),'Indian')]"));
			for(WebElement i:test)
			{
				System.out.println(i.getText());
			}
			
			

			
		}
}
