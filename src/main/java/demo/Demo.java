package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {

	WebDriver driver;
		
	@BeforeClass
		public void createNewTask() {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
			driver.get("https://todomvc.com/examples/react/#/)");
		}
		
		
		
		//Create the multiple task
		@Test(priority=1)
		public void newTask() throws InterruptedException{
			for(int i=1;i<=4;i++) {
			driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("demo"+String.valueOf(i));
//			driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(String.valueOf(i));
			driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.ENTER);
			Assert.assertTrue(true);
			Thread.sleep(3000);
			}
		}
		
//		//rename the task
//		@Test(priority=2,dependsOnMethods= {"newTask"})
//		public void renameTask() {
//			Actions act=new Actions(driver);
//			WebElement dc=driver.findElement(By.xpath("/html/body/section/div/section/ul/li[1]/div/label"));
//			String value=driver.findElement(By.xpath("/html/body/section/div/section/ul/li[1]/div/label")).getText();
//			act.doubleClick(dc).build().perform();
//			for(int j=1;j<=value.length();j++)
//			{
//				act.sendKeys(Keys.BACK_SPACE).build().perform();
//			}
//			act.sendKeys("DemoRename").build().perform();
//			driver.findElement(By.xpath("/html/body/section/div/footer/ul")).click();
//			Assert.assertTrue(true);
//		}
//			
//		@Test(priority=3)
//		public void deleteTask() {
//			driver.findElement(By.xpath("/html/body/section/div/section/ul/li[2]/div/button")).click();		
//			Assert.assertTrue(true);
//		}
//		
//		@Test(priority=4)
//		public void markTaskAsComp() {
//			driver.findElement(By.xpath("/html/body/section/div/section/ul/li[2]/div/input")).click();
//			Assert.assertTrue(true);
//			
//		}
//		
//		@Test(priority=5)
//		public void delCompTask() {
//			driver.findElement(By.xpath("/html/body/section/div/footer/ul/li[3]/a")).click();
//			driver.findElement(By.xpath("/html/body/section/div/section/ul/li/div/button")).click();
//			Assert.assertTrue(true);
//		}
			
		@AfterClass
		public void tearDown(){
			driver.close();
			
		}
}
