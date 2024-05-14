package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.FbForgotPassword;
import pom.FbLoginOrSignUpPage;

public class FaceBookTest {
	
	WebDriver driver;
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before Suite");
	}
	
	
	@BeforeTest
	public void beforeTest() 
	{
		
	System.out.println("Before Test");	
	}
	
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("beforeclass");
		
		 driver = new ChromeDriver();    
		driver.manage().window().maximize();
		
		
	}
	
	@BeforeMethod
	public void launchForgotPasswordPage()
	{
		System.out.println("beforemethod");
		
		driver.get("https://www.facebook.com");
		
		FbLoginOrSignUpPage fbLoginOrSignUpPage = new FbLoginOrSignUpPage(driver);

		fbLoginOrSignUpPage.sendUserName("velocity@1234");
		fbLoginOrSignUpPage.sendPassword("12345");
		fbLoginOrSignUpPage.clickOnForgotPasswordButton();

	}
	
	@Test
	public void verifyPasswordShouldBeChangedSuccessfully()
	{
		System.out.println("test1");
		
		FbForgotPassword fbForgotPassword = new FbForgotPassword(driver);
		fbForgotPassword.sendEmailOrPhoneNo("velocity@1234");
		fbForgotPassword.clickOnSearchButton();

	}
	
	@Test
	public void verifyErrorMessageWhenPasswordFunctionalityIsUsed()
	{
		System.out.println("test2");
		
		FbForgotPassword fbForgotPassword = new FbForgotPassword(driver);
		fbForgotPassword.sendEmailOrPhoneNo("7798463565");
		fbForgotPassword.clickOnCancelButton();

	}
	
	@AfterMethod
	public void CaptureScreenshotOfFailedTest()
	{
		System.out.println("aftermethod");
		System.out.println("Take the screenshot of failed test");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("afterclass");
		driver.close();
	}
	
	@AfterTest
	public void afterTest() 
	{
		
	System.out.println("Before Test - TestingAnnotation");	
	}

	
	 @AfterSuite
	    public void afterSuite()
	    {
	    	System.out.println("after suite - TestingAnnotation");
	    }
}
