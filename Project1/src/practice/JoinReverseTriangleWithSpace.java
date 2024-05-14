package practice;

public class JoinReverseTriangleWithSpace {
	
	
//	 *****
//	  ****
//	   ***
//	    **
//	     *
//	    **
//	   ***
//	  ****
//	 *****

	

	public static void main(String[] args) {
		
		
		int line=5;
		
		for(int a=line; a>=1; a--)            // lines
		{
			for(int b=line; b>=a; b--)          // spaces
			{
				System.out.print(" ");
			}
			
			for(int c=1; c<=a; c++)           // stars
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		int lines=4;
		
		
		
		for(int a=1; a<=lines; a++)           // lines
		{
			for(int b=lines; b>=a; b--)       // spaces
			{
				System.out.print(" ");
			}
			
			for(int c=0; c<=a; c++)               // stars
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
		
	}

}
