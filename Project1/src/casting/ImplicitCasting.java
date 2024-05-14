package casting;

public class ImplicitCasting {
	
	public static void main(String[] args) {
		
		byte a=23;  // 1 byte
		int b;      // 4 byte
		
		// byte to int
		b=a;      //   4 byte <-  1 byte
		System.out.println(a);
		System.out.println(b);
		
		
		int c=45;     // 4 byte
		float d;      // 4 byte
		
		//int to float
		d=c;     //  4 byte <- 4 byte
		System.out.println(c);
		System.out.println(d);
		 
		
		int e=67;    // 4 byte
		double h;    // 8 byte
		
		//int to double
		h=e;       // 8 byte <- 4 byte
		System.out.println(e);
		System.out.println(h);
		
		
		int k=678;     // 4 byte
		long j;        // 8 byte
		
		//int to long
		j=k;         // 8 byte <- 4 byte
		System.out.println(k);
		System.out.println(j);
		
		
		long r=567;   // 8 byte  
		double y;      // 8 byte
		
		// long to double
		y=r;             // 8 byte <- 8 byte
	    System.out.println(r);
	    System.out.println(y);
		
	}

}
