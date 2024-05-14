package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingKeyworddependsOnMethods {
	
	
		@BeforeSuite
		public void beforesuite()
		{
			System.out.println("Before Suite - TestingKeyworddependsOnMethods");
		}
		
		
		@BeforeTest
		public void beforeTest() 
		{
			
		System.out.println("Before Test - TestingKeyworddependsOnMethods");	
		}
		
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class - TestingKeyworddependsOnMethods");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method - TestingKeyworddependsOnMethods");
	}
     
	// dependsOnMethods
	// used to set dependent methods
	
	// "test1" is dependents on "test3"
	// if test3 is PASSED then test1 will be execute
	// if test 3 is FAILED test1 will not be execute i.e skip
     
    
	@Test(priority=1, dependsOnMethods = {"test3"})
	public void test1()
	{
		System.out.println("test1 - TestingKeyworddependsOnMethods");
	}
	
	@Test(priority=-2)
	public void test2()
	{
		System.out.println("test2 - TestingKeyworddependsOnMethods");
	}
	
	@Test(priority=0)
	public void test3()
	{
		System.out.println("test3 - TestingKeyworddependsOnMethods");
		Assert.fail();
	}
	
	@Test(priority=4)
	public void test4()
	{
		System.out.println("test4 - TestingKeyworddependsOnMethods");
	}
	
	
	
    @AfterMethod
	public void afterMethod()
	{
		System.out.println("After method - TestingKeyworddependsOnMethods");
	}
    
    @AfterClass
	public void afterClass()
	{
		System.out.println("After class - TestingKeyworddependsOnMethods");
	}
    
    
    
   
    @AfterTest
    public void afterTest()
    {
    	System.out.println("after test - TestingKeyworddependsOnMethods");
    }
    
  
    @AfterSuite
    public void afterSuite()
    {
    	System.out.println("after suite - TestingKeyworddependsOnMethods");
    }


}
