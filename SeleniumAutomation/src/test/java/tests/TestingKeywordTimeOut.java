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

public class TestingKeywordTimeOut {
	
	
			@BeforeSuite
		public void beforesuite()
		{
			System.out.println("Before Suite - TestingKeywordTimeOut");
		}
		
		
		@BeforeTest
		public void beforeTest() 
		{
			
		System.out.println("Before Test - TestingKeywordTimeOut");	
		}
		
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class - TestingKeywordTimeOut");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method - TestingKeywordTimeOut");
	}
     
	//timeOut
	//1. To set the maximum execution time for any test method
	//2. If test method is time consuming for execution, then we can use timeout
	//   to execute maximum execution time
	
	
     
    
	@Test(priority=1, timeOut=3000)  // 3000 msec=3 sec
	public void test1() throws InterruptedException
	{
		System.out.println("test1 - TestingKeywordTimeOut");
		Thread.sleep(4000);
		System.out.println("Hello");
	}
	
	@Test(priority=-2)
	public void test2()
	{
		System.out.println("test2 - TestingKeywordTimeOut");
	}
	
	@Test(priority=0)
	public void test3()
	{
		System.out.println("test3 - TestingKeywordTimeOut");
	}
	
	@Test(priority=4)
	public void test4()
	{
		System.out.println("test4 - TestingKeywordTimeOut");
	}
	
	
	
    @AfterMethod
	public void afterMethod()
	{
		System.out.println("After method - TestingKeywordTimeOut");
	}
    
    @AfterClass
	public void afterClass()
	{
		System.out.println("After class - TestingKeywordTimeOut");
	}
    
    
    
    
    @AfterTest
    public void afterTest()
    {
    	System.out.println("after test - TestingKeywordTimeOut");
    }
    
    
    @AfterSuite
    public void afterSuite()
    {
    	System.out.println("after suite - TestingKeywordTimeOut");
    }


}
