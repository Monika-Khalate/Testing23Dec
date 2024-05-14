package oopsinheritance;

public class OverridingSubClass extends OverridingSuperClass{
	
  	void test()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		OverridingSuperClass x= new OverridingSuperClass();   // super class object
		x.test();
		
		
		OverridingSubClass y = new OverridingSubClass();     // sub class object
		
		y.test();
		
		
		
		
	}

}
