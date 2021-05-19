package multipleTab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		
		String link1="https://www.facebook.com/";
		String link2="https://www.google.com/";
		System.out.println(link1);
		
		
		String[] list= {"https://www.google.com/","https://www.facebook.com/","https://www.yahoo.com/"};
		System.out.println(list[0]);
		System.out.println(list[1]);
		System.out.println(list[2]);
//		driver.get(link1);
		
	}
	
}
