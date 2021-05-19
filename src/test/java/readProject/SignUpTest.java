package readProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.expedia.co.in/app");
		Set<String> window=driver.getWindowHandles();
		Iterator<String> iterator=window.iterator();
		String win1=iterator.next();
		System.out.println(win1);
		driver.findElement(By.xpath("/html/body/div[2]/div/header/section/div[1]/div/nav/div[3]/button/span/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/header/section/div[1]/div/nav/div[3]/div/div/div/div/div/div[1]/div/div[2]/a[1]/span/span")).click();
		
//		window=driver.getWindowHandles();
//		iterator=window.iterator();
//		win1=iterator.next();
//		String win2=iterator.next();
//		System.out.println(win2);
//		driver.switchTo().frame("a-lsblyg9g9hfr");
	
		driver.findElement(By.xpath("(//input[@name='signin-loginid'])[1]")).sendKeys("asdfsdf");
		driver.findElement(By.xpath("//input[@id='gss-signin-password']")).sendKeys("sdfasf");
		driver.findElement(By.xpath("//button[@id='gss-signin-submit']")).click();
		
		String error=driver.findElement(By.xpath("//p[@id='signInEmailErrorMessage']")).getText();
		System.out.println(error);
	}

}
