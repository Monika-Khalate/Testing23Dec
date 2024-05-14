package constructor;

public class Practice {
	
	// static, non static
	
	static int a= 10;   // static variable
	int b= 78;         // non static variable
	
	
	static void alpha()       // static method
	{
		System.out.println("static method");
	}
	
	void testing()            // non static method
	{
		System.out.println("non static method");
	}
	  
	
	// constructor is a concept due to which static & non static concepts are created
	
	Practice()           // constructor:- NOT static & NOT non static
	{
		System.out.println("Zero argument");
	}
	
	public static void main(String[] args) {
		
		Practice p=new Practice();
		
		alpha();
		Practice.alpha();
		p.alpha();
		
		
		p.testing();
		
	}
}
