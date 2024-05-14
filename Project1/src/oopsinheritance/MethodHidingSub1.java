package oopsinheritance;

public class MethodHidingSub1 extends MethodHidingSuper {
	
	
	// Method Hiding
	static void test()
	{
		
		System.out.println("Hello");
	}

	//MethodHidingSuper.test()
	//super class method is hidden in sub class
}
