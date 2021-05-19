package testNgByRahulInvoThred;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvoCationCount {
	
	@Test(dataProvider="LoginData")
	public void testCase1(String name,String psw) throws InterruptedException
	{
		System.out.println(name+"   "+psw);
		Date d=new Date();
		System.out.println("invocation count"+d);
		Thread.sleep(2000);
	}
	
	@DataProvider(name="LoginData",parallel=true)
	public Object[][] getData()
	{
		Object[][] loginData=new Object[2][2];
		loginData[0][0]="Kavit";
		loginData[0][1]="Wankhede";
		loginData[1][0]="Sameer";
		loginData[1][1]="Dhote";
		
		return loginData;
	}
	
	

}
