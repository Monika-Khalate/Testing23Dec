package stringclass;

public class DifferentMethods {
	public static void main(String[] args) {
		
		String a="Velocity class Pune Testing 2020";
		String b="2023";
		
		boolean x= b.isEmpty();
		System.out.println(x);
		
		boolean y = b.isBlank();
		System.out.println(y);
		
		b="";
		System.out.println(b);
		x=b.isEmpty();
		System.out.println(x);
		
		y=b.isBlank();
		System.out.println(y);
		System.out.println("-------------------------");
		
		b=null;
//		x=b.isEmpty();
//		System.out.println(x);
//		y=b.isBlank();
//		System.out.println(y);
		
		b=new String();
		x=b.isEmpty();
		System.out.println(x);
		
		y=b.isBlank();
		System.out.println(y);
		
		System.out.println("--------------------------------");
		
		a="Velocity\nBatch";
		System.out.println(a);
		
		// \n \t \r
		b="\n";
		System.out.println(b);
		x=b.isEmpty();      // check for /n /t /r character
		System.out.println(x);
		
		y=b.isBlank();
		System.out.println(y);
		
	}

}
