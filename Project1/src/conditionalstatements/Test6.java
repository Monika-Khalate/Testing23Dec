package conditionalstatements;

public class Test6 {
	
	// find largest number between 4 numbers
	
	public static void main(String[] args) {
		
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("a is largest = "+a);
				}
				else
				{
					System.out.println("d is largest = "+d);
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println("c is largest = "+c);
				}
				else
				{
					System.out.println("d is largest = "+d);
				}
			}
		
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println("b is largest = "+b);
				}
				else
				{
					System.out.println("d is largest = "+d);
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println("c is largest = "+c);
				}
				else
				{
					System.out.println("d is largest = "+d);
				}
			}
		}
	}

}
