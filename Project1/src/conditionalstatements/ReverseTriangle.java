package conditionalstatements;

public class ReverseTriangle {

	
	
	public static void main(String[] args) {
		
		
		for(int a=5; a>=1; a--)
		{
			for(int b=4; b>=a; b--)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}
	
	
}
