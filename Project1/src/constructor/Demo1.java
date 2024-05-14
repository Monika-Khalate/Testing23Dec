package constructor;

public class Demo1 {

	
	public Demo1()       // zero argument
	{
		
		System.out.println("This is demo1 constructor");
		
	}
	
	public Demo1(int a, int b) // parametarized constructor
	{
		System.out.println("Addition " + (a+b));
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		 Demo1 d1= new Demo1();      // object of class  
		
		Demo1 d2= new Demo1(10, 15);  
		
		
		new Demo1();
		new Demo1(10,15);
		
		
	}
	
}
