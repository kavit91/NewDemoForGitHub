package dataDrivernTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginTest {

	@Test(dataProvider="LoginData")
	public void loginTest1(String uname,String psw)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(psw);
		driver.findElement(By.name("submit")).click();
		
		if(driver.getTitle().equals("Login: Mercury Tours"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.findElement(By.linkText("Home")).click();
		
		driver.close();
		
	}
	
	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:/Users/User/eclipse-workspace/A/Excel/userPassword.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int row_num=sheet.getLastRowNum();
		int col_num=sheet.getRow(0).getLastCellNum();
		
		String[][] loginData=new String[row_num][col_num];
		
		for(int i=1;i<=row_num;i++)
		{
			XSSFRow row =sheet.getRow(i);
			for(int j=0;j<col_num;j++)
			{
				loginData[i-1][j]=row.getCell(j).toString();
			}
		}
		return loginData;
		
	}
}
