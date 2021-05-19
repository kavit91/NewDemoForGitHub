package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@Parameters({"uname","psw"})
	@Test
	void testCase1(String name,String password)
	{
		System.out.println("This is testCase1_______________");
		System.out.println("Input form paraters  "+name+"   "+password);
		
	}
	
	

}
