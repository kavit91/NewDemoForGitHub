package testNgFailTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test
	public void gmailLoginTest()
	{
		System.out.println("this is gmail login Test");
		Assert.assertTrue(true);
	}
}
