package version4Report;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {
	
	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void setExtent()
	{
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/NikhilReport.html");
		htmlReporter.config().setDocumentTitle("Automation report");
		htmlReporter.config().setReportName("Functional report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();	
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Hostname", "LacalHost");
		extent.setSystemInfo("OS", "Window");
		extent.setSystemInfo("TesterName", "Kavit");
		extent.setSystemInfo("Browser", "Chorme");
	}
	
	@AfterTest
	public void endReport()
	{
		extent.flush();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "Test Case Fail is "+ result.getName());
			test.log(Status.FAIL, "Test Case Fail is "+ result.getThrowable());
			
			String screenShotPath=BaseClass.getScreenShot(driver, result.getName());
			test.addScreenCaptureFromPath(screenShotPath);
			
		}
		
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "Test Case Skiped is "+ result.getName());
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Test Case Passed is "+ result.getName());
			
		}
		
		driver.close();
	}
	
	public static String getScreenShot(WebDriver driver,String screenName) throws IOException
	{
		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String trglocation=System.getProperty("user.dir")+"/Screenshot/"+ screenName+dateName+".png";
		File trg=new File(trglocation);
		FileUtils.copyFile(src, trg);
		return trglocation;
	}
	

}
