package rahulArora;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionCapture {

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
			
			driver.get("https://www.wikipedia.org/");
			
//			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("way2automation");
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@title='Search']"))).sendKeys("way2automation");
//			driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
//			List<WebElement> list=driver.findElements(By.tagName("a"));
//			for(int i=1;i<=list.size();i++)
//			{
//				String value=list.get(i).getText();
//				System.out.println(value+" ");
//				driver.findElement(By.xpath("//h3[contains(text(),'Way2Automation')]")).click();
//			}
			
			WebElement block=driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[7]/div[3]"));
			List<WebElement> list=block.findElements(By.tagName("a"));
			System.out.println(list.size());
			
			for(int i=0;i<list.size();i++)
			{
				String values=list.get(i).getText();
				String values1=list.get(i).getAttribute("href");
				System.out.println("---"+values1);
			}
			
			
			driver.close();
			
			
			
		}
}
