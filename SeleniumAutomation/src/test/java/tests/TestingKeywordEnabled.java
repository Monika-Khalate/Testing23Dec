package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingKeywordEnabled {
	
	

		@BeforeSuite
		public void beforesuite()
		{
			System.out.println("Before Suite - TestingKeywordEnabled");
		}
		
		
		@BeforeTest
		public void beforeTest() 
		{
			
		System.out.println("Before Test - TestingKeywordEnabled");	
		}
		
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class - TestingKeywordEnabled");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method - TestingKeywordEnabled");
	}
     
	// enabled=false
	//To skip the test method from execution
	//By default enabled=true
     
    
	@Test(priority=1, enabled=false)
	public void test1()
	{
		System.out.println("test1 - TestingKeywordEnabled");
	}
	
	@Test(priority=-2)
	public void test2()
	{
		System.out.println("test2 - TestingKeywordEnabled");
	}
	
	@Test(priority=0)
	public void test3()
	{
		System.out.println("test3 - TestingKeywordEnabled");
	}
	
	@Test(priority=4)
	public void test4()
	{
		System.out.println("test4 - TestingKeywordEnabled");
	}
	
	
	
    @AfterMethod
	public void afterMethod()
	{
		System.out.println("After method - TestingKeywordEnabled");
	}
    
    @AfterClass
	public void afterClass()
	{
		System.out.println("After class -TestingKeywordEnabled");
	}
    
    
    
    
    @AfterTest
    public void afterTest()
    {
    	System.out.println("after test - TestingKeywordEnabled");
    }
    
    
    @AfterSuite
    public void afterSuite()
    {
    	System.out.println("after suite - TestingKeywordEnabled");
    }


}
