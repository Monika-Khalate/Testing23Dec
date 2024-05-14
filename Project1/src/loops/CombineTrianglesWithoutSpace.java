package loops;

public class CombineTrianglesWithoutSpace {
	public static void main(String[] args) {
		
	int line=5;
	
	for(int a=1; a<=line; a++)
	{
		
	for(int b=1; b<=a; b++)	
	{
		
		System.out.print("*");
	}
		System.out.println();
		
	}
		
	
	int lines=(line-1);
	
	for(int a=1; a<=lines; a++)
	{
		for(int b=lines; b>=a; b--)
		{
			
		System.out.print("*");	
		
		}
		
		System.out.println();
		
	}
	
	
	
	
	
	
	
}
}
