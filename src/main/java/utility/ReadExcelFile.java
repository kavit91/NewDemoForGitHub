package utility;

import java.io.IOException;

public class ReadExcelFile {
	
	public static String file="C:\\Users\\User\\eclipse-workspace\\A\\Excel\\nopComLogIn.xlsx";
	public static String sheet="Sheet1";
	public static void main(String[] args) throws IOException {
		
		ExcelReader er=new ExcelReader(file, sheet);
		
	}

}
