package methods;

public class ParameterizedMethod2 {
	
	
	// parameterized method test()
	
		static void test(int x, boolean y)
		{
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		System.out.println(x);
		System.out.println(y);
		}

		// system defined method main()
		
		public static void main(String[] args) {
			
			System.out.println("start");
			test(45, true);                   // parameterized method call (type - int, boolean)
			System.out.println("d");
			test(50, false);                    // parameterized method call (type - int, boolean)
			System.out.println("e");
			test(30, false);                   // parameterized method call (type - int, boolean)
			System.out.println("f");
		    test(100, true);                   // parameterized method call (type - int, boolean)
			
		}

}
