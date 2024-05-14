package stringclass;

public class MethodsOfStringClass {
	
	public static void main(String[] args) {
		
		
		String a = "Velocity";
		String b = "velocity";
		
		String c = new String("Velocity");
		String d = new String("velocity");
		
		
		         //string data compare
				boolean result = a.equals(c);
				System.out.println(result);
				
				
				// case sensitive
				result = c.equals(d);
				System.out.println(result);
				
				
				result = c.equalsIgnoreCase(d);
				System.out.println(result);
				
				
				d= d.toUpperCase();
				System.out.println(d);
				
				b= b.toLowerCase();
				System.out.println(b);
				
				
				
				
			}

}
