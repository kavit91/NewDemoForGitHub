package thisKeyword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeMethod
	void setup()
	{
		System.out.println("-------This is set up method---(BeforeMethod)------------------------------------------");
	}
	
	@AfterMethod
	void tearDown()
	{
		System.out.println("-------This is tear down method----(AfterMethod)-------------------------------");
	}
	
	@BeforeClass
	void ClassMethod1()
	{
		System.out.println("---------This is ClassMethod1-------(BeforeClass)--------------------------------------");
	}
	
	@AfterClass
	void ClassMethod2()
	{
		System.out.println("-----------This is ClassMethod2------(AfterClass)-----------------------------");
	}
	
	@BeforeTest
	void extentReport()
	{
		System.out.println("---------This is extent report-------(BeforeTest)--------------------------------------");
	}
	
	@AfterTest
	void endReport()
	{
		System.out.println("-----------This is close extend report------(AfterTest)-----------------------------");
	}
	
	@BeforeSuite
	void suitmethod1()
	{
		System.out.println("---------This is suitmethod start-------(BeforeSuite)--------------------------------------");
	}
	
	@AfterSuite
	void suitmethod2()
	{
		System.out.println("-----------This is suitmethod end------(AfterSuite)-----------------------------");
	}

}
