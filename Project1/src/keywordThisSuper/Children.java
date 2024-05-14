package keywordThisSuper;

public class Children {
	
	static int a=12;  // global static 
	int b= 34;        // global non static
	
	
	// non static method
	void test()
	{
	int a= 1000;
	int b=3000;
	
	System.out.println(a);
	System.out.println(b);    // x.b   y.b
	
	System.out.println(Children.a);
	
	// this keyword can not use in static method as 'this' represent object of same class and
	// static method can be called before object.
	
	
	// we can't call non static variable in static method without creating object.
	
	
	
	System.out.println(this.a);  // we can use this keyword to call class level static variable. 
                                 //but this is not proper way 
	
	System.out.println(this.b);  // class level non static variable calling
	                             // x.b   y.b
	
	}
	
	// this keyword is used to call the global variable of same class 
	//when global variable name & local variable name are same

	
	// this keyword represent the object of same class
	
	
	public static void main(String[] args) {
		
		
		Children x= new Children();
		x.b=545;
		
		Children y= new Children();
		y.b=666;
		
		x.test();  // x.b
		y.test();   // y.b
	}
}
