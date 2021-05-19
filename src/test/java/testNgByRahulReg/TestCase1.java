package testNgByRahulReg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase1 {
	
SoftAssert sa=new SoftAssert();
	
	@Test(priority=3,groups= {"smoke"})
	public void test4()
	{
		System.out.println("@@@@@@@@ Test4 start @@@@@@@@");
		System.out.println("'''''''''''''test1''''''''''''''");
		String exp_result="google";
		String acc_result="google";
		sa.assertEquals(exp_result, acc_result,"Expected result does not matched");		
		
		System.out.println("'''''''''''''test2''''''''''''''");
		sa.assertEquals(true, true);
		
		System.out.println("'''''''''''''test3''''''''''''''");
		sa.assertEquals(true, true);
		
		System.out.println("'''''''''''''test4''''''''''''''");
		sa.assertEquals(true, true);
		
		sa.assertAll();
	}

	@Test(priority=3,groups= {"smoke"})
	public void test3()
	{
		System.out.println("@@@@@@@@ Test3 start @@@@@@@@");
		System.out.println("'''''''''''''test1''''''''''''''");
		String exp_result="google";
		String acc_result="google";
		sa.assertEquals(exp_result, acc_result,"Expected result does not matched");		
		
		System.out.println("'''''''''''''test2''''''''''''''");
		sa.assertEquals(true, true);
		
		System.out.println("'''''''''''''test3''''''''''''''");
		sa.assertEquals(true, true);
		
		System.out.println("'''''''''''''test4''''''''''''''");
		sa.assertEquals(true, true);
		
		sa.assertAll();
	}

}
