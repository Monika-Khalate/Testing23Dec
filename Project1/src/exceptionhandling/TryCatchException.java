package exceptionhandling;

public class TryCatchException {
	
	// exception handling - try catch (Run time exception)
	
	static int [] a= {23, 56, 78};
	static int b= 5;
	static int c= 0;
	static int d;
	
	static void test()
	{
		System.out.println("Hello");
		
		try {
			
			System.out.println("try");
			d=b/c;
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("catch");
			System.out.println("alternative code");
			
			c=1;
			d=b/c;
		}
		
		System.out.println(d);
		System.out.println(a[2]);
	}
	
	
	
	public static void main(String[] args) {
		
		test();
	}

}
