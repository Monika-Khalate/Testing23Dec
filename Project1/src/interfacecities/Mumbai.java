package interfacecities;

public class Mumbai extends Delhi implements Inter1, Bengluru{   // class can extends another class & implements
	                                                            // interface(s) at a same time BUT 1st extends class
	                                                          // then implements interface(s)
	                                                         // two interfaces separated by using coma(,)
	
	
	
	public void test()
	{
		System.out.println("Hello");
	}
	
	public void get()
	{
		System.out.println("Hi");
	}
	
	void beta()
	{
		
	}
	
	public void delta()
	{
		System.out.println("delta");
	}

	public static void main(String[] args) {
		
		System.out.println(Bengluru.g);
		System.out.println(Mumbai.g);
		System.out.println(Inter1.g);
		
		
		Mumbai m = new Mumbai();
		m.test();
		m.get();
		m.delta();
		
		
		Bengluru.set();  // static method in interface used for security purpose.
		                 // that's why it is called only by it's interface name
		
		// Inter1.set();    not possible     
		// Mumbai.set();    not possible
	}
	
	
}
