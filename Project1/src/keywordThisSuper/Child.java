package keywordThisSuper;

public class Child extends Parent {
	
	static int a=12;  // global static 
	int b= 34;        // global non static
	
	// inherited variable a, b
	// total variable a,b,  a,b
	
	
	// static method
	static void test()
	{
		System.out.println(a);
	//	System.out.println(b);   b is non static variable. call by creating object of current class.
		
		
		System.out.println(Parent.a);  // static variable of parent class
	//	System.out.println(super.a);  super keyword not use to call static variable
	//	System.out.println(super.b);   super keyword not used in static method
		
		
	
	// super keyword is used to call global variable of super class when global variable name of super class
	// and global variable name of sub class are same.
			
		
	}
	
	// super keyword represent the object of super class
	public static void main(String[] args) {
		
		
		Child c= new Child();         //sub- c.b          super- c.b
		test();          // c.b
	}
	
	

}
