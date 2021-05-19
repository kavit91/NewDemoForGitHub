package dataDrivernTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataProvider {

	
	@Test
	public void test() throws IOException
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
			for(int j=0;j<=col_num;j++)
			{
				loginData[i-1][j]=row.getCell(j).toString();
			}
		}
	}
}
