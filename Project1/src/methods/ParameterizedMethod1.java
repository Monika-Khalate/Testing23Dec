package methods;

public class ParameterizedMethod1 {
	
	// parameterized method test()
	
	static void test(int x)
	{
	System.out.println("a");
	System.out.println("b");
	System.out.println("c");
	System.out.println(x);
	}

	// system defined method main()
	
	public static void main(String[] args) {
		
		System.out.println("start");
		test(45);                   // parameterized method call (type - int)
		System.out.println("d");
		test(50);                    // parameterized method call (type - int)
		System.out.println("e");
		test(30);                   // parameterized method call (type - int)
		System.out.println("f");
	    test(100);                   // parameterized method call (type - int)
		
	}
	
}
