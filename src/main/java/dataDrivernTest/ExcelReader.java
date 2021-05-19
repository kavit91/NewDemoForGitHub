package dataDrivernTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReader {

	@Test
	public void readFIle() throws IOException, InterruptedException
	{
		FileInputStream fis=new FileInputStream("C:/Users/User/eclipse-workspace/A/Excel/userPassword.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int row_num=sheet.getLastRowNum();
		int col_num=sheet.getRow(0).getLastCellNum();
		Thread.sleep(3000);
		
		System.out.println(row_num+" "+col_num);
		for(int i=0;i<=row_num;i++)
		{
			XSSFRow row =sheet.getRow(i);
			for(int j=0;j<col_num;j++)
			{
				String values=row.getCell(j).toString();
				System.out.printf(values+"   ");
			}
			System.out.println();
		}
	}
}

