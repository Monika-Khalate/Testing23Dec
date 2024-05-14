package oopsabstract;

           // abstract class - super class
public abstract class Demo {
	
	static void test()

	{
		System.out.println("Hi");
	}
	
	void get()
	{
		System.out.println("Non static - Complete");
	}
	
	
	// abstract method
     abstract void set();
     
     Demo()
     
     {
    	 System.out.println("zero argument constructor of abstract class");
     }
     
     
     Demo(String s)
     {
    	 
     }
     
     // if we create the object of abstract class then this abstract method can not be declared.
     //     i.e.  it fails to create the object
     
}



  // static method can not be abstract, because static method must be declared at time of compilation.
 // if we declared it as abstract then it can not be binded at compilation.
 // because body is missing.


// static abstract void data();               // invalid