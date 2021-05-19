package PracticeOnSelenium;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSoftAssert {

	SoftAssert sa;
	@Test
	void test1()
	{
		sa=new SoftAssert();
		System.out.println("start test");
		sa.assertEquals(true, false);
		System.out.println("end test");
		System.out.println("end test");
		System.out.println("end test");
		

		sa.assertAll();
	}
	
	@Test
	void test2()
	{
		Assert.assertEquals(true, true);
	}
	
	@Test
	void test3()
	{
		sa.assertEquals(true, false);
		
		sa.assertAll();
	}
}
