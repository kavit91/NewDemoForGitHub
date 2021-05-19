package rahulArora;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

		public static void main(String[] args) throws InterruptedException {
			
			
//			for(int i=1;i<=5;i++)
//			{
//				System.out.println("//input["+i+"]");
//			}
			
			
			
//			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
//			FirefoxDriver driver=new FirefoxDriver();
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://accounts.google.com/signin");
			System.out.println(driver.manage().window().getSize());
//			driver.manage().window().setSize(new Dimension(500,400));
			driver.findElement(By.name("identifier")).sendKeys("kswankhede9596@gmail.com");
			
//			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"headingText\"]")).click();
			
			Actions action=new Actions(driver);
			action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
			action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
			
			driver.findElement(By.name("identifier")).click();
			
			action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
			action.sendKeys(Keys.chord(Keys.CONTROL+"t")).build().perform();
		
			
			
			
		}
}
 