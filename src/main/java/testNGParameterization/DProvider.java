package testNGParameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DProvider {
	
	@Test(dataProvider="loginData")
	void loginTest(String name,String psw)
	{
		System.out.println("user_name : "+name);
		System.out.println("password : "+psw);
	}

	
	@DataProvider(name="loginData")
	String[][] getData()
	{
		String[][] loginData= {{"abc","psw1"},{"pqr","psw2"},{"mnp","psw3"},{"xyz","psw4"}};
		return loginData;
	}
}
