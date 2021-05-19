package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\A\\Driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]")));
		
		
		
		
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		WebElement page=driver.findElement(By.xpath("//ul[@class='pagination pagination-lg pager']"));
		List<WebElement> pages=page.findElements(By.tagName("a"));
		System.out.println(pages.size());
		
		//*[@id="myTable"]/tr[1]
		//*[@id="myTable"]/tr[2]/td[3]
		
		if(pages.size()>0)
		{
			for(int i=1;i<=pages.size()-2;i++)
			{
				driver.findElement(By.xpath("//a[text()='1']")).click();
				int row_count=driver.findElements(By.xpath("//*[@id=\"myTable\"]/tr")).size();
				int cell_count=driver.findElements(By.xpath("//*[@id=\"myTable\"]/tr[1]/td")).size();
				System.out.println(row_count+" "+cell_count);
				
				for(int k=2;k<=row_count;k++)
				{
					for(int j=1;j<=cell_count;j++)
					{
						String value=driver.findElement(By.xpath("//*[@id='myTable']/tr["+k+"]/td["+j+"]")).getText();
						System.out.print(value+" ");
					}
					System.out.println();
				}
			}
		}
		
		

		
		

		
		
		driver.close();
		
		
		
		
		
		
		
	}
}
