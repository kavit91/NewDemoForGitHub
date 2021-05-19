package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\A\\Driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
	
		
//		String link = "window.open('https://www.google.com');";
//		((JavascriptExecutor)driver).executeScript("window.open('https://www.google.com')");
//		driver.get("https://www.google.com");
//		for(int i=1;i<=4;i++)
//		{
//			((JavascriptExecutor)driver).executeScript("window.open('https://www.google.com')");
//		}
//		
//		Set<String> list=driver.getWindowHandles();
//		System.out.println(list.size());
//		List<String> win_list=new ArrayList<>(list); 
//		System.out.println(win_list);
//		int count=1;
//		for(String sr:win_list)
//		{
//			driver.switchTo().window(sr);
//			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("I am in window "+count);
//			driver.findElement(By.xpath("/html/body/div[1]/div[4]                                                 ")).click();
//			driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
//			count++;	
//		}
//		
//		for(String sr:win_list)
//		{
//			driver.switchTo().window(sr);
//			driver.close();
//		}
		
		//-----------------------------------------------------------------------------------------//
	
		
		driver.get("http://www.google.com");    
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]")).click();
        Robot r = new Robot();        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_T);
        driver.get("http://www.facebook.com");
      
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_1);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_1);
        driver.get("http://www.gmail.com");
        
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_2);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_2);
        driver.get("http://www.google.com");
        
        
        
        
        
//		driver.close();
	}
	
}
