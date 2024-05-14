package conditionalstatements;

public class Test1 {
	
	// find large number using less than(<)
	
	
	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		int c=15;
		
		if(a<b)
		{
			if(a<c)
			{
				
			   System.out.println("c is large");	
					
			}
			
			else
			{
				
				System.out.println("a is large");
			}
			
		}	
		
		else
		{
			if(b<c)
			{
			   System.out.println("c is large");	
				
			}
			else
			{
			   System.out.println("b is large");	
				
			}
			
			
			
		}
		
		
	}

}
