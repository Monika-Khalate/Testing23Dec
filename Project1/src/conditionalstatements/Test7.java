package conditionalstatements;

public class Test7 {

	// find largest number between 4 numbers using <
	
	public static void main(String[] args) {
		
		int a= 7;
		int b= 1;
		int c= 5;
		int d= 0;
		
		if(a<b)
		{
			if(a<c)
			{
				if(a<d)
				{
					//System.out.println("d is largest = "+d);
					System.out.println("a is small = "+a);
				}
				else
				{
					//System.out.println("a is largest = " +a);
					System.out.println("d is small = "+d);
				}
			}
			else
			{
				if(c<d)
				{
					//System.out.println("d is largest = "+d);
					System.out.println("c is small = "+c);
				}
				else
				{
					//System.out.println("c is largest = "+c);
					System.out.println("d is small = "+d);
				}
			}
		}
				
			else
			{
				if(b<c)
				{
					if(b<d)
					{
						//System.out.println("d is largest = "+d);
						System.out.println("b is small = "+b);
					}
					else
					{
						//System.out.println("b is largst = "+b);
						System.out.println("d is small = "+d);
					}
				}
				else
				{
					if(c<d)
					{
						//System.out.println("d is largest = "+d);
						System.out.println("c is small = "+c);
					}
					else
					{
						//System.out.println("c is largest = "+c);
						System.out.println("d is small = "+d);
					}
				}
			}
		}
		
	}

