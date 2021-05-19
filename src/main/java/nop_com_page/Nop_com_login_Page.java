package nop_com_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Nop_com_login_Page {
	
	WebDriver ldriver;
	
	public Nop_com_login_Page(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Object identification method
	@FindBy(name="Email") WebElement txtMail;
	@FindBy(name="Password") WebElement txtPassword;
	@FindBy(xpath="//input[@type='submit']") WebElement btnLogin;
	@FindBy(linkText="Logout") WebElement btnLogout;
	
	//Action method
	
	public void setEmail(String uEmail)
	{
		txtMail.clear();
		txtMail.sendKeys(uEmail);
	}
	
	public void setPsw(String upsw)
	{
		txtPassword.clear();
		txtPassword.sendKeys(upsw);
	}
	public void clickLogin()
	{
		btnLogin.click();
	}
	public void clickLogout()
	{
		btnLogout.click();
	}
	

}
