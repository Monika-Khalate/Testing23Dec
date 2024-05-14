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
import org.testng.asserts.SoftAssert;

public class TestingKeywordInvocationCount {
	
	private SoftAssert soft;
	
	

		@BeforeSuite
		public void beforesuite()
		{
			System.out.println("Before Suite - TestingKeywordInvocationCount");
		}
		
		
		@BeforeTest
		public void beforeTest() 
		{
			
		System.out.println("Before Test - TestingKeywordInvocationCount");	
		}
		
	
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("Before class - TestingKeywordInvocationCount");
		}
		
		
		
	     @BeforeMethod
		public void beforeMethod()
		{
			System.out.println("Before method - TestingKeywordInvocationCount");
			
			soft = new SoftAssert();  // object 2
		}
	     
	     
	     // invocationCount
	     //1. To execute test method multiple time
	     //2. by default invocationCount is 1
	     //3. If we set invocation count less than 1, then that method will not be execute
	     //4. We should use invocationCount with 2,3,4,5,........
	     
	     
	    
	     @Test(priority=1, invocationCount=3)
			public void test1()
			{
				System.out.println("test1 - TestingKeywordInvocationCount");
			}
			
			@Test(priority=-2)
			public void test2()
			{
				System.out.println("test2 - TestingKeywordInvocationCount");
				
				String actualUrl= "www.facebook.com";
				String expectedUrl = "www.facebook.com/Home";
				
				String actualTitle = "Facebook";
				String expectedTitle = "Facebook-Home page";
				
				soft.assertEquals(actualUrl, expectedUrl);
		        soft.assertEquals(actualTitle, expectedTitle);
				
				soft.assertAll();  // object 1
			}
			
			@Test(priority=0)
			public void test3()
			{
				System.out.println("test3 - TestingKeywordInvocationCount");
				
				String actualUrl= "www.facebook.com";
				String expectedUrl = "www.facebook.com/setting";
				
				String actualTitle = "Facebook";
				String expectedTitle = "Facebook-setting page";
				
				soft.assertEquals(actualUrl, expectedUrl);
				soft.assertEquals(actualTitle, expectedTitle);
				
				soft.assertAll();
			}
			
			@Test(priority=4)
			public void test4()
			{
				System.out.println("test4 - TestingKeywordInvocationCount");
			}
			
		
		
		
	    @AfterMethod
		public void afterMethod()
		{
			System.out.println("After method - TestingKeywordInvocationCount");
		}
	    
	    
	   
	    @AfterClass
		public void afterClass()
		{
			System.out.println("After class - TestingKeywordInvocationCount");
		}
	    
	    
	    
	   
	    @AfterTest
	    public void afterTest()
	    {
	    	System.out.println("after test - TestingKeywordInvocationCount");
	    }
	    
	   
	    @AfterSuite
	    public void afterSuite()
	    {
	    	System.out.println("after suite - TestingKeywordInvocationCount");
	    }



}
