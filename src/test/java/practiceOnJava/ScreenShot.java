package practiceOnJava;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	WebDriver driver;
	
	public void captureScreenshot(){
		try{
		TakesScreenshot ss=(TakesScreenshot)driver;
	        File src=ss.getScreenshotAs(OutputType.FILE);	
		File trg=new File("target location of file");
		FileUtils.copyFile(src,trg);
		}catch(Throwable t)
		{
		   t.printStackTrace();
		}
		}

	
	public static void main(String[] args) {
		
		ScreenShot obj=new ScreenShot();
		obj.captureScreenshot();
		
	
	}
}
