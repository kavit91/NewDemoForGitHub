package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	@Parameters("browser")
	@Test
	public void browserTesting(String br)
	{
		if(br.equals("ff"))
		{
			System.out.println("This is fireFox browser");
		}
		
		else if(br.equals("cb"))
		{
			System.out.println("This is chrome browser");
		}
		
		if(br.equals("ie"))
		{
			System.out.println("This is ie browser");
		}
	}
	
	

}
