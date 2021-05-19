package version4Report;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MercuryDemo extends BaseClass{

	@Test(dataProvider="LoginData")
	public void mercuryLoginTest(String userName,String password)
	{
		test=extent.createTest("mercuryLoginTest");
		test.createNode("Test data used : "+userName+"   "+password);
		
		driver.findElement(By.name("userName")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		
		Assert.assertEquals(driver.getTitle(), "Login: Mercury Tours");
		
		driver.findElement(By.linkText("Home")).click();
	}
	
	
	
//	@DataProvider(name="LoginData")
//	String[][] getData()
//	{
//		String[][] loginData= {{"mercury","mercury"},{"mercury1","mercury1"},{"merc","merc"}};
//		return loginData;
//	}
	
	
	
	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException {	

	FileInputStream fis=new FileInputStream("./Excel/userPassword.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Sheet2");
	
	int row_count=sheet.getLastRowNum();
	int cell_count=sheet.getRow(0).getLastCellNum();
	System.out.println(row_count+" "+cell_count);
	
	String[][] loginData=new String[row_count][cell_count];	

	for(int i=1;i<=row_count;i++)
	{
	    XSSFRow row=sheet.getRow(i);
	    for(int j=0;j<cell_count;j++)
	    {
	       loginData[i-1][j]=row.getCell(j).toString();
	    }
	}
	return loginData;
	}

}
