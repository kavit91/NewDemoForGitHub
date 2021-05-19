package nikhil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDriven {
	
	
	
	//through parameter
	
	@Parameters({"username","userpassword"})
	@Test
	void loginTest(String uname,String psw)
	{
		System.out.println(uname);
		System.out.println(psw);
	}

}
