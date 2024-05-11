package test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.SignUpPage;

public class TestingSignUpPage extends BaseClass{
	
	
	WebDriver driver;
	
		@BeforeSuite
		public void beforesuite()
		{
			System.out.println("Before Suite - TestingSignUpPage");
		}
		

		@Parameters ("browser")
		@BeforeTest
		public void launchBrowser(String browserName) 
		{
			
		System.out.println("Before Test - TestingSignUpPage");	
		
		if(browserName.equals("Chrome"))
		{
			driver=openChromeBrowser();
		}
		
		
		if(browserName.equals("Edge"))
		{
			driver= openEdgeBrowser();
		}
		
		driver.manage().window().maximize();
		
		
		}
		
		
		
		@BeforeClass
		public void initializePOMClasses()
		{
			System.out.println("Before class - TestingSignUpPage");
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			
			
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
				
		}
		
		
		
	     @BeforeMethod
		public void launchSignInPage()
		{
			System.out.println("Before method -  TestingSignUpPage");
			
			
			driver.get("https://magento.softwaretestingboard.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		}
	     
	     
	    
		@Test
		public void verifySignInSuccessfully()
		{
			System.out.println("test - TestingSignUpPage");
			
			SignUpPage sp = new SignUpPage(driver);
			sp.SignIn();
			sp.Email();
			sp.Password();
			sp.Submit();
			
			
		}
		
		
	    @AfterMethod
		public void captureScreenshotOfTestCases() throws IOException
		{
			System.out.println("After method - TestingSignUpPage");
			
			
			
			String cd = new SimpleDateFormat("dd.MM.YYYY.hh.mm.ss")
					    .format(Calendar.getInstance().getTime());
			
			TakesScreenshot s = (TakesScreenshot)driver;
			File source = s.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Dell\\Documents\\Zoom\\Automation\\Screenshots\\TestSignUp"+cd+".png");
			FileHandler.copy(source, dest);
		}
	    
	    
	    
	    @AfterClass
		public void browserClose() throws InterruptedException
		{
			System.out.println("After class - TestingSignUpPage");
			
		}
	    
	   
	    @AfterTest
	    public void afterTest() throws InterruptedException
	    {
	    	System.out.println("after test - TestingSignUpPage");
	    	
	    	Thread.sleep(2000);
			driver.close();
			driver = null;
			System.gc();  // garbage collector- to free memory
	    }
	    
	    
	    @AfterSuite
	    public void afterSuite()
	    {
	    	System.out.println("after suite - TestingSignUpPage");
	    }

	

}
