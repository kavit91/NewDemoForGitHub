package practiceOnJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestingJava {
	
	
		public static void main(String[] args) throws IOException {
			
			
			FileInputStream fis=new FileInputStream("./PropertyFIle/Config.properties") ;
			Properties pro=new Properties();
			pro.load(fis);
				
			System.out.println(pro.getProperty("chromePath"));
			System.out.println(pro.getProperty("url"));
		}
		
		
	
	

}
