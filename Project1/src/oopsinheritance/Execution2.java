package oopsinheritance;

public class Execution2 {
	public static void main(String[] args) {
		
		
		// normal call
				System.out.println(Demo.a);
				Demo x= new Demo();
				System.out.println(x.b);
				
				System.out.println(Test.c);
				Test y=new Test();
				System.out.println(y.d);
				
				System.out.println(Beta.r);
				Beta k=new Beta();
				System.out.println(k.g);
				
				// Hierarchical Inheritance
				// inheritance call
				
				System.out.println(Test.a);
				System.out.println(y.b);
				
				System.out.println(Beta.a);
				System.out.println(k.b);
				
				
				
				// not possible
				//System.out.println(Beta.c);
				//System.out.println(k.d);
	}

}

