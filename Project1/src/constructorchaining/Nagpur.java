package constructorchaining;

public class Nagpur extends Pune{

	static int a=12;  // global static 
	int b= 34;        // global non static
	
	Nagpur()
	{
		
		
		
		System.out.println("Sub class");
		
		
		a=222;
		b=444;
		
		// constructor chaining
		// call costructor of another class inside constructor of current class
		
	//	new Pune();
		
	}
	
	
	//when we call constructor of Nagpur class then pune class constructor is also automatically called
}
