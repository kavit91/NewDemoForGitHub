package practiceOnJava;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelFile {

	
	@DataProvider(name="LoginData")
	String[][] data() throws Throwable{
		
	FileInputStream fis=new FileInputStream("file Path");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Sheet Name");
	
	int row_count=sheet.getLastRowNum();
	int cell_count=sheet.getRow(0).getLastCellNum();

	String[][] loginData=new String[row_count][cell_count];

	for(int i=1;i<=row_count;i++)
	{
           //XSSFRow row=sheet.getRow(i);
	   for(int j=0;j<cell_count;j++)
	   {
		loginData[i-1][j]=sheet.getRow(i).getCell(j).toString();
	   }
	}
	
		

	return loginData;
	}


	@Test(dataProvider="LoginData")
	public void loginTest(String name,String psw)
	{
		

	}
}
