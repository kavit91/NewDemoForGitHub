package practiceOnJava;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DublicateArray {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
	

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		
		Wait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
						.withTimeout(Duration.ofSeconds(10))
						.pollingEvery(Duration.ofSeconds(3))
						.ignoring(NoSuchElementException.class);
		
	
		
	}

}
