package rahulArora;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://accounts.google.com/signin");
//		driver.get("http://www.google.com");
//		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
//		driver.get("https://money.rediff.com/index.html");
//		driver.get("https://zapier.com/sign-up/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']"))).sendKeys("way2automation.com");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='submit'][@class='gNO89b'][@value='Google Search'])[2]"))).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Way2Automation')]"))).click();
//		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
//		Actions action=new Actions(driver);
//		action.moveToElement(link).perform();
//		driver.findElement(By.xpath("//a[contains(text(),'Practice site 1')]")).click();
		
//		List<WebElement> list=driver.findElements(By.xpath("//select[@name='country']"));
//		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i).getText());
//		}
		
//		Select select=new Select(driver.findElement(By.xpath("//select[@name='country']")));
//		select.selectByVisibleText("Austria");
		
		//perform rigth click operation
//		Actions action=new Actions(driver);
//		action.contextClick(driver.findElement(By.xpath("//table[1]/tbody/tr/td[3]/p[2]/img"))).perform();;
//
//		action.moveToElement(driver.findElement(By.xpath("//*[@id='dm2m1i1tdT']"))).build().perform();
//		action.moveToElement(driver.findElement(By.xpath("//*[@id='dm2m2i1tdT']"))).build().perform();   ////*[@id="dm2m2i1tdT"]  
//		driver.findElement(By.xpath("//*[@id='dm2m3i1tdT']")).click();
		
		
		//read values from webTable
//		WebElement block=driver.findElement(By.xpath("//*[@id=\"div_bseindices\"]/div/div/div"));
//		int row_count=driver.findElements(By.xpath("//*[@id='div_bseindices']/div/div/div/ul")).size();
//		int cell_count=driver.findElements(By.xpath("//*[@id='div_bseindices']/div/div/div/ul[1]/li")).size();
//		System.out.println(row_count+"  "+cell_count);
//		String data=driver.findElement(By.xpath("//*[@id='div_bseindices']/div/div/div/ul[1]/li[1]")).getText();
//		System.out.println(data);
		
		
		//read values from webTable
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(8));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
//		for(int i=1;i<=row_count;i++)
//		{
//			for(int j=1;j<=cell_count;j++)
//			{
//				String value=driver.findElement(By.xpath("//*[@id='div_bseindices']/div/div/div/ul["+i+"]/li["+j+"]")).getText();
//				System.out.print(value+" ");
//			}
//			System.out.println();
//		}
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(8));
//		WebElement name=driver.findElement(By.name("//*[@id='app']/div/div/div/div[3]/div/div/div/div[4]/div[1]/input"));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div/div/div/div[3]/div/div/div/div[4]/div[1]/input"))).sendKeys("Kavit");
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("//*[@id=\"app\"]/div/div/div/div[3]/div/div/div/div[4]/div[1]/input")));
//		name.sendKeys("Kavit");
//		driver.navigate().refresh();
//		
//		name.sendKeys("Kavit");
		
		//handle staleElementReferanceException
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("//input[@name='q']")).sendKeys("way2automation");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']"))).sendKeys("way2automation");
		
		
//		driver.get("https://www.pavantestingtools.com/");
//		System.out.println("hit the url--pavantenstingtools");
//		Thread.sleep(2000);
//		WebElement sam=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[3]/a"));
//		System.out.println("press on vidio tab");
//		sam.click();
		
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[3]/a"))).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[3]/a--"))).click();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
//		System.out.println("refresh the page");
//		Thread.sleep(2000);
//		try {
//			sam.click();
//		} catch (Exception e) {
//			sam=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[3]/a"));
//			sam.click();
//		
//		}
//		System.out.println("again click on video btn");
		
		Wait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("User defind time out of 30 sec")
				.ignoring(NoSuchElementException.class);
		
		
		
		driver.close();
//		driver.quit();
		
	}

}
