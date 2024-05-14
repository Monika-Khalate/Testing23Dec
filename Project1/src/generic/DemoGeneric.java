package generic;

public class DemoGeneric <E,R>{
	
	static char b; // global static
	int a = 23;   // global non static
	
	E c; // generic variable - non sttic
	R d; 
	
	public R test(E x)
	{
		System.out.println("Hello");
		return d;
	}
	
	public void alpha(E x)
	{
		System.out.println("Hello");
	}
	
	public R get(int x)
	{
		System.out.println("Hello");
		return d;
	}

}
