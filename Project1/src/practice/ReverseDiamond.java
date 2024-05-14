package practice;

public class ReverseDiamond {

	
	public static void main(String[] args) {
		
		
		int line=5;
		
		for(int a=line; a>=1; a--)
		{
			for(int b=line; b>=a; b--)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		
           int lines=4;
		
		for(int a=1; a<=lines; a++)
		{
			for(int b=lines; b>=a; b--)
			{
				System.out.print(" ");
			}
			for(int c=0; c<=a; c++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
