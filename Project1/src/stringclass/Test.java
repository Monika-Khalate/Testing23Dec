package stringclass;

public class Test {
	
	public static void main(String[] args) {
		
		String a = "velocity";
		String b = "velocity";
		
		String c = new String("velocity");
		String d = new String("velocity");
		
		// equals to operator with string is used to compare the address of string.
		
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(b==c);
		System.out.println(b==d);
		
		
		
	}

}
