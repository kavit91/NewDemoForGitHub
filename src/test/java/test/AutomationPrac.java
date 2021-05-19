package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPrac {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\A\\Driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/JsrEF/tryit.asp?filename=tryjsref_submit_get");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@title='Change Theme'])")).click();
	}

}
