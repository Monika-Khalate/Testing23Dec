package stringclass;

public class TestingMethods {
	
	public static void main(String[] args) {
		
		String a="Velocity";
		String b="2023";
		
		// to concat/bind 2 strings
		String c=a.concat("batch");
		
		System.out.println(a);
		System.out.println(c);
		
		c=a.concat(b);
		System.out.println(c);
		
		c=a+"class";
		System.out.println(c);
		
		c="Testing" + a + "Batch" + b;
		System.out.println(c);
	}

}
