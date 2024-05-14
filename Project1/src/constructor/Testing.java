package constructor;

public class Testing {

	
	static int a= 10; // static variable
	int b =20;        // non static variable
	
	public static void main(String[] args) {
		
		// default class
		// 1. object creat x
		// 2. variable declared x.b
		// 3. variable initialize x.b = 20
		
		Testing x = new Testing();
		
		System.out.println(x.b);       // used
		
		System.out.println(a);
		
	}
}
