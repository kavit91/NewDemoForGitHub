package practiceJava;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelSheet {
	
	public WebDriver driver;
	  
	
		
	@Test(dataProvider="LogInData")
	   public void loginTest(String uname,String psw)
	   {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\A\\Driver1\\chromedriver.exe");
		   driver=new ChromeDriver();
//		  
		   driver.manage().window().maximize();
//		   driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		   
		   driver.get("http://demo.guru99.com/test/newtours/");
		   driver.findElement(By.name("userName")).sendKeys(uname);
		   driver.findElement(By.name("password")).sendKeys(psw);
		   driver.findElement(By.name("submit")).click();
		   
		   // title:  Login: Mercury Tours
		   
		   driver.findElement(By.linkText("Home")).click();
		   driver.close();
	   }
	   
		@DataProvider(name="LogInData")
	  	String[][] getData() throws IOException{
	  		
	  		FileInputStream fis=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\A\\Excel\\userPassword.xlsx");
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			   XSSFSheet sheet=wb.getSheet("Sheet2");
			   
			   int row_count=sheet.getLastRowNum();
			   int cell_count=sheet.getRow(0).getLastCellNum();
			   System.out.println(row_count+"  "+cell_count);   // row -7 column- 2
			   
			   String[][] loginData=new String[row_count][cell_count];
			   for(int i=1;i<=row_count;i++)
			   {
				   XSSFRow row=sheet.getRow(i);
				   for(int j=0;j<=cell_count-1;j++)
				   {
					   loginData[i-1][j]=row.getCell(j).toString();   //10,11   20 21
					   
				   }
			   }
			   return loginData;
	  	}

}



	