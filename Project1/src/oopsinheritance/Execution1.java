package oopsinheritance;

public class Execution1 {
	
	public static void main(String[] args) {
		
		// normal call
		System.out.println(Demo.a);
		Demo x= new Demo();
		System.out.println(x.b);
		
		System.out.println(Test.c);
		Test y=new Test();
		System.out.println(y.d);
		
		System.out.println(Alpha.e);
		Alpha z=new Alpha();
		System.out.println(z.f);
		
		
		
		// multi level inheritance
		// inheritance call
		
		//stage 1
		System.out.println(Test.a);
		System.out.println(y.b);
		
		//stage 2
		System.out.println(Alpha.a);
		System.out.println(Alpha.c);
		System.out.println(z.b);
		System.out.println(z.d);
		
		
	}

}
