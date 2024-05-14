package operations;

public class ComparisionOperations {
	
	public static void main(String[] args) {
		
	byte a =123;
	byte b=4;
	
	boolean c=a>b;  // result is always in boolean format
	System.out.println(c);
	
	c=a<b;
	System.out.println(c);
		
	c= a==b;
	System.out.println("equals too="+c);
	
	c= a!=b;
	System.out.println("not equals too="+c);
	
	System.out.println("--------------------------------");
	
	
	a=123;
	b=123;
	
	// greater than or equals too
	c= a>=b;
	System.out.println(c);
	
	// less than or equals too
	c= a<=b;
	System.out.println(c);
	
	c= a==b;
	System.out.println("equals too="+c);
		
	c= a!=b;
	System.out.println("not equals too="+c);
		
		
		
		
		
		
		
		
		
		
		
	}

}
