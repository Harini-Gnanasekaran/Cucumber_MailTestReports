package com.feature.common_functions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import junit.framework.Assert;

public class CommonFunctions {

	public WebDriver driver = null;
	public void openOrangeHRMSite()
	{
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://enterprise.demo.orangehrmlive.com/dashboard");
	}
	public void enterUserName(String userName)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
	}
	public void enterPassword(String password)
	{
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	public void clickLoginButton()
	{
		driver.findElement(By.id("btnLogin")).click();
	}
	public void UserSignInVerification(String welcomeText)
	{
		String greetings = driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(greetings,welcomeText);
	}
	public void closeOrangeHRMSite()
	{
		driver.quit();
	}
}
