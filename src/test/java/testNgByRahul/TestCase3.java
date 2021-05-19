package testNgByRahul;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase3 {
	
SoftAssert sa=new SoftAssert();
	
	@Test(priority=2)
	public void title_test()
	{
		System.out.println("@@@@@@@@ title start @@@@@@@@");
		System.out.println("'''''''''''''test1''''''''''''''");
		String exp_result="google";
		String acc_result="google.com";
		sa.assertEquals(exp_result, acc_result,"Expected result does not matched");		
		
		System.out.println("'''''''''''''test2''''''''''''''");
		sa.assertEquals(true, false);
		
		System.out.println("'''''''''''''test3''''''''''''''");
		sa.assertEquals(true, true);
		
		System.out.println("'''''''''''''test4''''''''''''''");
		sa.assertEquals(true, false);
		
		sa.assertAll();
	}

}
