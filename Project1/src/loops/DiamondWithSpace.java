package loops;

public class DiamondWithSpace {
	
	public static void main(String[] args) {
		
		
		int line=10;
		for(int a=1; a<=line; a++)   // for number of lines
		{
			
			for(int b=(line-1); b>=a; b--)    // for printing spaces
			{
				System.out.print(" ");
			}
			
			for(int b=1; b<=a; b++)        // for printing star
			{
				System.out.print("* ");
			}
			
			System.out.println();	
			
			
		}
		
		
		int lines=(line-1);
			for(int a=lines; a>=1; a--)           // for no. of lines
				
				{
					
					for(int b=lines; b>=a; b--)       // for printing spaces
					{
						System.out.print(" ");
					}
					
					for(int b=1; b<=a; b++)
					{
						System.out.print("* ");
					}
					
					
					System.out.println();
						
					
				}
		
		
		
		
	}
		
		
		
		
		
		
}		
		
		
		
		
		
		
		
	


