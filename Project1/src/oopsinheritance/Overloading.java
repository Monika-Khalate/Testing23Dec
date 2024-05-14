package oopsinheritance;

public class Overloading {
	
	void test()
	{
		System.out.println("velocity");
	}
	
	void test(int x)
	{
		System.out.println("batch");
	}
	
	static void demo()
	{
		System.out.println("Hi");
	}

	static void demo(char y)
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		Overloading.demo();
		Overloading.demo('&');
		
		Overloading z= new Overloading();
		z.test();
		z.test(45);
	}
}
