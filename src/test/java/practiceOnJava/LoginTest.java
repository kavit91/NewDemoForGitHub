package practiceOnJava;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void loginTest()
	{
		ConfigReader config=new ConfigReader();
		System.out.println(config.getChromePath());
		System.out.println(config.getUrl());
		
		System.out.println(System.getProperty("user.dir"));
	}
}
