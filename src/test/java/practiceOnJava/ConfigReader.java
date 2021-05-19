package practiceOnJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	Properties pro;
	
	ConfigReader()
	{
		try {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/PropertyFile/Config.Properties");
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	
	public String getChromePath()
	{
		return pro.getProperty("chromePath");
	}
	
	public String getUrl()
	{
		return pro.getProperty("url");
	}

}
