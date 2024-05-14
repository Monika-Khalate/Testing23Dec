package pack;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckingOfTestNG {
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeclass");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforemethod");
	}
	
	@Test
	public void test()
	{
		System.out.println("test");
	}
	
	

}
