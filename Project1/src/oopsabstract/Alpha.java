package oopsabstract;
          
      // concrete class - sub class
public class Alpha extends Demo{

	
	void set()
	{
		System.out.println("Set method");
	}
	
	// test  get  set  Demo
	
	public static void main(String[] args) {
		
		Alpha A=new Alpha();     // constructor call ( only for zero argument constructor)
		
		                         // we can call only ZERO ARGUMENT CONSTRUCTOR of abstract class
		                         //in concrete class by creating object of concrete class. (inheritance)
		                          

		
	}
}
