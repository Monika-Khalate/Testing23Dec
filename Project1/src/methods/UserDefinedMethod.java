package methods;

public class UserDefinedMethod {
	
	static void test()
	{
		// method body/ definition/ implementation
		
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		
		System.out.println("this is static method");
	}

	
	void testing()
	{
		System.out.println("this is non static method");
	}
	
	// system define main method
	public static void main(String[] args) {
		
		System.out.println("Start");
		test();                       // user defined method call
		System.out.println("10");
		test();                       // user defined method call
		System.out.println("20");
		test();                       // user defined method call
		System.out.println("30");
		test();                          // user defined method call
		
	System.out.println("--------------------------------------------------------------------------------------");
	
	
	
	
	
	
		test();
		UserDefinedMethod.test();
		
		
		
		UserDefinedMethod m1 = new UserDefinedMethod();      // object creation
		
		m1.testing();
		
		
		
		
		
	}
}
