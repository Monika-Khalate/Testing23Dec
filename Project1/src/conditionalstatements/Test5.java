package conditionalstatements;

public class Test5 {
	// find large number using AND operator
	
	public static void main(String[] args) {
		
		int a=3;
		int b=5;
		int c=1;
		
		
		if(a>=b && a>=c)
		{
			System.out.println("a is large");
		}
		
		if(b>=a && b>=c)	
		{
			System.out.println("b is large");
		}
		
		if(c>=a && c>=b)
		{
			System.out.println("c is large");
		}
	}

}
