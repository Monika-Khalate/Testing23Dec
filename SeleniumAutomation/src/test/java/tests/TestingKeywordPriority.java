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
import org.testng.asserts.SoftAssert;

public class TestingKeywordPriority {

	
	
		@BeforeSuite
		public void beforesuite()
		{
			System.out.println("Before Suite - TestingKeywordPriority");
		}
		
		
		@BeforeTest
		public void beforeTest() 
		{
			
		System.out.println("Before Test - TestingKeywordPriority");	
		}
		
	
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("Before class - TestingKeywordPriority");
		}
		
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("Before method - TestingKeywordPriority");
		}
	     
		// priority
		//1. use to control/change the execution sequence of test method
		//2. priority number can be negative or positive
		//3. The method having smallest priority number is having highest priority
		//4. Default priority of test method is zero
		//5. When priority of two or more method is same then execution in between those method is based on 
		//   alphabetical order of method name
	     
	    
		@Test(priority=1)
		public void test1()
		{
			System.out.println("test1 - TestingKeywordPriority");
		}
		
		@Test(priority=-2)
		public void test2()
		{
			System.out.println("test2 - TestingKeywordPriority");
		}
		
		@Test(priority=0)
		public void test3()
		{
			System.out.println("test3 - TestingKeywordPriority");
		}
		
		@Test(priority=4)
		public void test4()
		{
			System.out.println("test4 - TestingKeywordPriority");
			String actualUrl= "www.facebook.com";
			String expectedUrl = "www.facebook.com/Home";
			
			String actualTitle = "Facebook";
			String expectedTitle = "Facebook123";
			
			// Hard Assert
			
//			Assert.assertEquals(actualUrl, expectedUrl);
//			
//			System.out.println("Hello");
//			
//			Assert.assertEquals(actualTitle, expectedTitle);
			
			// Soft Assert
			SoftAssert soft = new SoftAssert();
			
			soft.assertEquals(actualUrl, expectedUrl);
			
			System.out.println("Hello");
			
			soft.assertEquals(actualTitle, expectedTitle);
			
			soft.assertAll();
	         
		}
		
		
		
	    @AfterMethod
		public void afterMethod()
		{
			System.out.println("After method - TestingKeywordPriority");
		}
	    
	    @AfterClass
		public void afterClass()
		{
			System.out.println("After class - TestingKeywordPriority");
		}

	    
	    
	    
	    @AfterTest
	    public void afterTest()
	    {
	    	System.out.println("after test - TestingKeywordPriority");
	    }
	    
	    
	    @AfterSuite
	    public void afterSuite()
	    {
	    	System.out.println("after suite - TestingKeywordPriority");
	    }
}
