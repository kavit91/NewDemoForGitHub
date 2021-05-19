package version4Report;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NopComTest extends BaseClass{
	
	@Test
	public void nopComTitleTest()
	{
		test=extent.createTest("nopComTitleTest");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "nopCommerce demo store111");
	}
	
	@Test
	public void nopComLogTest()
	{
		test=extent.createTest("nopComLogTest");
		
		Boolean status=driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")).isDisplayed();
		Assert.assertTrue(status);
	}
	
	@Test
	public void nopComLogInTest()
	{
		test=extent.createTest("nopComLoginTest");
		Assert.assertTrue(true);
	}

	
	
	
	
	
}
















