package practice;

public class JoinReverseTriangleWithoutSpace {
	
	
//	*****
//	****
//	***
//	**
//	*
//	**
//	***
//	****
//	*****
	

	public static void main(String[] args) {
		
		int line=5;
		
		for(int i=line; i>=1; i--)            // lines
		{
			for(int j=1; j<=i; j++)           // stars
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		int lines=4;
		
		for(int i=1; i<=lines; i++)            // lines
		{
			for(int j=0; j<=i; j++)            // stars
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
			
		
	}
	

}
