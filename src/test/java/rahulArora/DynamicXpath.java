package rahulArora;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXpath {
	
	
	public static WebDriver driver;
	public XSSFWorkbook wb;
	
		public void captureScreenshot(){

		try{
		TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("destination of file"));
		}
		catch(Exception e)
		{
		    e.printStackTrace();	
		}
		
		}
		
		
		@DataProvider(name="LoginData",parallel=true)
		public Object[][] getData(){

	
		
		try {
			FileInputStream fis=new FileInputStream("filepath");
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		XSSFSheet sheet=wb.getSheet("sheetName");
		
		int row_count=sheet.getLastRowNum();
		int cell_count=sheet.getRow(0).getLastCellNum();
		
		Object[][] loginData=new Object[row_count][cell_count];

		for(int i=1;i<=row_count;i++)
		{
			for(int j=0;j<cell_count;j++)
			{
			     Object value=sheet.getRow(i).getCell(j).toString();
			     loginData[i-1][j]=value;
			}

		}
		
		return loginData;

		}
		







	
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
//		driver.findElement(By.xpath("//input[contains(@id,'u_0_n')]")).sendKeys("Kavit");
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_n_')]")).sendKeys("Kavit Wankhede");
		driver.findElement(By.xpath("//input[contains(@id,'u_0_4_')]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		System.out.println("its worked");
		driver.close();
		
		

	}
	

}
