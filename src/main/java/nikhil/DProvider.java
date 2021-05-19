package nikhil;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DProvider {
	
		@Test(dataProvider="Nikhi")
		void loginTest(String name,String psw)
		{
			System.out.println(name+" "+psw);
		}
		
		
			@DataProvider(name="Nikhi")
			public String[][] getData() throws Exception{
			
				FileInputStream file=new FileInputStream("./Excel/userPassword.xlsx");
				XSSFWorkbook wb=new XSSFWorkbook(file);
				XSSFSheet sheet=wb.getSheet("Sheet2");
				
				int row_count=sheet.getLastRowNum();
				int cell_count=sheet.getRow(0).getLastCellNum();
				
				String[][] loginData=new String[row_count][cell_count];
				
				
				for(int i=1;i<=row_count;i++)
				{
					for(int j=0;j<cell_count;j++)
					{                            
						String value=sheet.getRow(i).getCell(j).toString();
						loginData[i-1][j]=value;
					}
				}
			
			
			return loginData;
			}
		
		
		

}
