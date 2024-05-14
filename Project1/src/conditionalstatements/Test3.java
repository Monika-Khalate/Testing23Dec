package conditionalstatements;

public class Test3 {
// find large number using less equal(<=)
	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		int c=20;
		
		if(a<=b)
		{
			if(a<=c)
			{
				System.out.println("c is large");
			}
			else
			{
				System.out.println("a is large");
			}
			
		}
		else
		{
			if(c<=b)
			{
				System.out.println("b is large");
			}
			else
			{
				System.out.println("c is large");
			}
		}
	}
}
