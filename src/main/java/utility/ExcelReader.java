package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	
	
	public ExcelReader(String filepath,String sheetName) throws IOException
	{
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(sheetName);
		
		int row_num=sheet.getLastRowNum();
		int col_num=sheet.getRow(0).getLastCellNum();
		
		for(int i=1;1<=row_num;i++)
		{
			XSSFRow row=sheet.getRow(i);
			String uemail=row.getCell(0).toString();
			String upsw=row.getCell(1).toString();
			
			System.out.printf("%-5s %10s %n",uemail,upsw);
		}
	}

	
}
