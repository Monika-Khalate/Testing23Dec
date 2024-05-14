package stringclass;

public class MethodsDemo {
	
	public static void main(String[] args) {
		
		String a="Velocity class pune Testing 2020";
		String b="2023";
		
		//To check argumented string is present in main string at starting
		boolean x =a.startsWith("Velo");
		System.out.println(x);            // true
		
		 x =a.startsWith("velo");
		System.out.println(x);            // false
		
		 x =a.startsWith("Veloa");
		System.out.println(x);            // false
		
	     x =a.startsWith("elo");
		System.out.println(x);            // false
		
		System.out.println("----------------------------------------------");
		
		// To check argumented string is present in the main string at ending
		x=a.endsWith("2020");
		System.out.println(x);                // true
		
		x=a.endsWith("2020 ");                // false
		System.out.println(x);
		
		
		b="Velocity class 2020 ";
		
		x=b.endsWith("2020");              // false
		System.out.println(x);
		
	}

}
