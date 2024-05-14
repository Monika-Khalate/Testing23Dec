package pack;

public class TestClass1 {
	
	public static void main(String[] args) {
		
		
		byte a= 120;
		short b=3278;
		int c= 3456478;
		long d= 565655665;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		// default fractional no is represented in 8 byte
		float e=23.345f; // f for to convert into 4 byte
		
		e = 341.567346796678f ;
		System.out.println(e);
		
		
		double g= 231.567346796678 ;
		System.out.println(g);
		
		// programmer mistake
		
		g=231.567346796678f ; // f for to convert into 4 byte
		System.out.println(g);
		
		g=231.567346796678d ;// d for to convert into 8 byte
		System.out.println(g);
		
	}

}
