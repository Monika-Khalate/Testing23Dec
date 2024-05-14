package interfaceimplementation;

public class ImplementationOfInterface implements AllIncomplete{
	
	// implementation class consider this method as a non static property
	// so, as a non-static property it will override.
	
	public void test()
	{
		System.out.println("Hello");
	}
	
	
	
	// implementation class consider this method as a non static property
	 public void get()
	  {
		 System.out.println("Hi"); 
	  }
	
	
	void beta()
	{
		
	}
	
	public static void main(String[] args) {
		
		ImplementationOfInterface  i= new ImplementationOfInterface();   // object of class
		i.test();  // abstract method
		i.get();   // default method 
		
		
		AllIncomplete.set();    // static method CAN NOT inherited by implementation class. 
		                        // ImplementationOfInterface.set() This is not possible
		                        // So called by its interface name
		                   
	}

}
