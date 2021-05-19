package multipleTab;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B extends A{
	
	public static WebDriver driver;
	
	@Test
	public void setup() throws AWTException, InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		
		
		Robot robot=new Robot();
		
		
		for(int i=1;i<=3;i++)
		{
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_T);
			
			robot.keyRelease(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			
		}
		
		
		
//		String link1="https://www.google.com/";
//		String link2="https://www.google.com/";
//		String link3="https://www.google.com/";
//		String link4="https://www.google.com/";
		
		String[] link= {"https://www.google.com/","https://www.facebook.com/","https://in.yahoo.com/?p=us","https://www.selenium.dev/selenium/docs/api/java/overview-summary.html"};
		
		
		
		Set<String> list=driver.getWindowHandles();
		int j=0;
		for(String i:list)
		{
			
			driver.switchTo().window(i);
			driver.get(link[j]);
			Thread.sleep(3000);
//			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("I am in window tab "+j);
			j=j+1;
		}
		
//		for(String k:list)
//		{
//			driver.switchTo().window(k);
//			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
//			Thread.sleep(2000);
//		}
		
		for(String l:list)
		{
			driver.switchTo().window(l);
			Thread.sleep(3000);
			driver.close();
		}

		
	}
}
