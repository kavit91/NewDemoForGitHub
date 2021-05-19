package inheritance;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassA {
	
	 	WebDriver driver;
	
		public void captureScreenshot() throws Exception{
		TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot/google.png");
		FileUtils.copyFile(src,trg);
		}

		public void captureSceen() throws Exception
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("file path"));	
		}
		
		
		@DataProvider(name="LoginData")
		String[][] data() throws Exception{

		FileInputStream fis=new FileInputStream("FIle path");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("SheetName");
		
		int row_count=sheet.getLastRowNum();
		int cell_count=sheet.getRow(0).getLastCellNum();

		String[][] loginData=new String[row_count][cell_count];
		
		for(int i=1;i<=row_count;i++)
		{
		     XSSFRow row=sheet.getRow(i);
		     for(int j=0;j<cell_count;j++)
		     {
			String values=row.getCell(j).toString();
			loginData[i-1][j]=values;
		     }
		}
		
		return loginData;

		}


		@Test(dataProvider="LoginData")
		public void loginTest(String uname,String psw)
		{

		}


		public static void main(String[] args) {
			
			
			
			
			
			
			
		}
	
	
}

