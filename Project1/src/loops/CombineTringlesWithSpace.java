package loops;

public class CombineTringlesWithSpace {
	
	public static void main(String[] args) {
		
	int line=10;
	
	for(int a=1; a<=line; a++)
	{
		for(int b=(line-1); b>=a; b--)
		{
			System.out.print(" ");
		}
		for(int b=1; b<=a; b++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
		
		
		
	
	
	int lines=(line-1);	
	
	for(int a=(line-1); a>=1; a--)	
		
	{
	for(int b=(lines); b>=a; b--)	
	{
		System.out.print(" ");
	}
		
	for(int b=1; b<=a; b++)	
	{
		System.out.print("*");
	}
		
	System.out.println();
	}	
		
		
		
		
		
	}

}
