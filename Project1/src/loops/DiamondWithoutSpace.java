package loops;

public class DiamondWithoutSpace {
	
	
	public static void main(String[] args) {
		
		
		int line=10;
		
		for(int a=1; a<=line; a++)    // for lines
		{
			for(int b=line-1; b>=a; b--)   // for space
			{
				System.out.print(" ");
			}
			for(int c=1; c<=(2*a)-1; c++)  // for stars
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		int lines=9;
		
		for(int a=lines; a>=1; a--)        // for lines
		{
			for(int b=(lines); b>=a; b--)   // for space
			{
				System.out.print(" ");
		    }
			for(int c=1; c<=(2*a)-1; c++)    // for stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
	
		
		
		
		
		
	}

}
