package casting;

public class ExplicitCasting {
	public static void main(String[] args) {
		
		short a = 123;   // 2 byte
		byte b;          // 1 byte
		
		// explicit casting without data loss
		b = (byte)a ;      // 1 byte <- 2 byte
		System.out.println(a);
		System.out.println(b);
		
		short c = 131;   // 2 byte
		byte d;          // 1 byte
		
		//explicit casting with data loss
		d = (byte)c ;     // 1 byte <- 2 byte
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("------------------------------------------");
		float p = 12.0f;   // 4 byte
	   int  q;          // 4 byte
		
		// explicit casting without data loss
		q = (int)p ;      // 4 byte <- 4 byte
		System.out.println(p);
		System.out.println(q);
		
		float r = 12.345f;   // 4 byte
		int s;          // 4 byte
		
		//explicit casting with data loss
		s = (int)r ;     // 4 byte <- 4 byte
		System.out.println(r);
		System.out.println(s);
		
		System.out.println("-----------------------------------------");
		double w = 12.1234d;   // 8 byte
		float x;          // 4 byte
		
		// explicit casting without data loss
		x = (float)w ;      // 4 byte <- 8 byte
		System.out.println(w);
		System.out.println(x);
		
		double y = 12.443233576656d;   // 8 byte
		float z;          // 4 byte
		
		//explicit casting with data loss
		z = (float)y ;     // 4 byte <- 8 byte
		System.out.println(y);
		System.out.println(z);
	}

}
