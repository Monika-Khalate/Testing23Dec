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

public class TestingAnnotation {
	
	// Method under @BeforeSuite annotation will be execute before the suite(suite tagname present in TestNG suite)
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before Suite - TestingAnnotation");
	}
	
	// Method under @BeforeTest annotation will be execute before the test(test tagname present in suite)
	@BeforeTest
	public void beforeTest() 
	{
		
	System.out.println("Before Test - TestingAnnotation");	
	}
	
	
	// method under @BeforeClass annotation is execute before the class(tagname)
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class - TestingAnnotation");
	}
	
	
	// method under @BeforeMethod annotation is execute before the every @Test (test method present in TestNG/Test class)
     @BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method -  TestingAnnotation");
	}
     
     
    // @Test annotation is used to design test method
	@Test
	public void test()
	{
		System.out.println("test - TestingAnnotation");
		
		String actualUrl = "Data";
		String expectedUrl = "Data";
		
		Assert.assertEquals(actualUrl, expectedUrl);	
		Assert.assertNotEquals(actualUrl, expectedUrl);
		
		// compare the inputs
		boolean result = actualUrl.equals(expectedUrl);
		
		Assert.assertTrue(result);
		Assert.assertFalse(result);
		
		// Apply result ontest method
		// forcefully failed the test method
		
		//Assert.fail();
	}
	
	// method under @AfterMethod annotation is execute after every @Test(every test method)
    @AfterMethod
	public void afterMethod()
	{
		System.out.println("After method - TestingAnnotation");
	}
    
    
    // method under @AfterClass annotation is execute after the class (tagname)
    @AfterClass
	public void afterClass()
	{
		System.out.println("After class - TestingAnnotation");
	}
    
    //The method under @AfterTest annotation will be execute after the test present in TestNG suite
    @AfterTest
    public void afterTest()
    {
    	System.out.println("after test - TestingAnnotation");
    }
    
    // The method under @AfterSuite annotation will be execute after the suite
    @AfterSuite
    public void afterSuite()
    {
    	System.out.println("after suite - TestingAnnotation");
    }

}
