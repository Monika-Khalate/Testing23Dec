package oopsinheritance;

public class Execution {
	
	public static void main(String[] args) {
		
		// Normal call
		
		System.out.println(Demo.a);
		Demo.set();
		
		Demo x=new Demo();
		System.out.println(x.b);
		x.get();
		
		
		System.out.println(Test.c);
		
		Test y=new Test();
		System.out.println(y.d);
		
		
		// single level inheritance
		// inheritance call
		
		System.out.println(Test.a);
		System.out.println(y.b);
		Test.set();
		y.get();
	}

}

