package testNGParameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterXML {
	@Parameters({"uname","psw"})
	@Test
	void getData(String uname,String psw)
	{
		System.out.println("username : "+uname);
		System.out.println("password : "+psw);
	}
}
