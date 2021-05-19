package nop_com_test;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.testng.annotations.Test;

import nop_com_base.Nop_com_BaseClass;
import nop_com_page.Nop_com_login_Page;
import utility.ExcelReader;

public class Nop_com_login_test	extends Nop_com_BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		Nop_com_login_Page lp=new Nop_com_login_Page(driver);
		{
			String file="C:\\Users\\User\\eclipse-workspace\\A\\Excel\\nopComLogIn.xlsx";
			String sheet1="Sheet1";
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet(sheet1);
			
			int row_num=sheet.getLastRowNum();
			int col_num=sheet.getRow(0).getLastCellNum();
			
			for(int i=1;1<=row_num;i++)
			{
				XSSFRow row=sheet.getRow(i);
				String uemail=row.getCell(0).toString();
				String upsw=row.getCell(1).toString();
				
				Thread.sleep(3000);
			
			lp.setEmail(uemail);
			logger.info(upsw);
			lp.setPsw("admin");
			logger.info("User Password is entered");
			lp.clickLogin();
			logger.info("Clicked on Login button");
			
//			Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
//			logger.info("Title is verified");
			
			if(driver.getTitle().equals("Dashboard / nopCommerce administration"))
			{
//				Assert.assertTrue(true);
				lp.clickLogout();
				logger.info("Test is Passed");
			}
			else
			{
				
				logger.info("Test is Failed");
			}
			
		}
			
		}
		
					
	}
	

}
