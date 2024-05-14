package conditionalstatements;

public class Test4 {
	// find large number using greater equal(>=)
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=20;
		
		if(a>=b)
		{
			if(a>=c)
			{
				System.out.println("a is large");
			}
			else
			{
				System.out.println("c is large");
			}
		}
		else
		{
			if(c>=b)
			{
				System.out.println("c is large");
			}
			else
			{
				System.out.println("b is large");
			}
		}
	}

}
