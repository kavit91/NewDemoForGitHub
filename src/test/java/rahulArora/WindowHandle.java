package rahulArora;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
		
		driver.get("https://www.hdfcbank.com/");
		
		
		//---------------------------------------------------------------------------
		System.out.println("------------------");
		Set<String> windows=driver.getWindowHandles();
		for(String i:windows)
			System.out.println(i);
		
		List<String> win=new ArrayList<>();
		for(int i=0;i<windows.size();i++)
		{
			
			win.add(windows.iterator().next());
		}

		System.out.println("-------------------using list-----");
		for(int i=0;i<win.size();i++)
		{
			
			
		}
		
		
		//------------------------------------------------------------------------------------------
		//window1
		String first_window=driver.getWindowHandle();
		System.out.println(first_window);
		
		driver.findElement(By.xpath("//a[contains(text(),'Locate us')]")).click();
		
		Set<String> winds=driver.getWindowHandles();
		Iterator<String> iterator=winds.iterator();
		String first_wind=iterator.next();	
		String second_wind=iterator.next();
		System.out.println(first_wind);
		
		
		//WIndow2
		iterator=winds.iterator();
		first_wind=iterator.next();	
		second_wind=iterator.next();
		System.out.println(second_wind);
		
//		String second_wind=driver.getWindowHandle();
//		System.out.println(second_wind);
		driver.switchTo().window(second_wind);
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("I am in Window 2");
		driver.findElement(By.xpath("(//a[contains(text(),'Credit Card')])[2]")).click();
		
		
		
		//Window3
		winds=driver.getWindowHandles();
		iterator=winds.iterator();
		first_wind=iterator.next();	
		second_wind=iterator.next();
		String third_wind=iterator.next();
		System.out.println(third_wind);
		
//		String third_wind=driver.getWindowHandle();
//		System.out.println(third_wind);
		driver.switchTo().window(third_wind);
		WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(20));
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[12]/div[1]/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/ul/li[4]/a/span")).click();
		
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div[12]/div[1]/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/ul/li[4]/a/span"))).click();
		
//		System.out.println("------------------");
//		Set<String> windows=driver.getWindowHandles();
//		for(String i:windows)
//			System.out.println(i);
//		
//		List<String> win=new ArrayList<>();
//		for(int i=0;i<windows.size();i++)
//		{
//			
//			win.add(windows.iterator().next());
//		}
//
//		System.out.println("-------------------using list-----");
//		for(int i=0;i<win.size();i++)
//		{
//			
//			System.out.println(win.get(0));
//			System.out.println(win.get(1));
//			System.out.println(win.get(2));
//		}
		
		driver.quit();
		
		
		
	}

}
