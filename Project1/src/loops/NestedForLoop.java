package loops;

public class NestedForLoop {
	public static void main(String[] args) {
	
		System.out.println("start");
		
		for(int a=1; a<=4; a++)
		{
			
			System.out.println("Hi");
			
			for(int b=1; b<=3; b++)
			{
				
				System.out.println("Bye");
			}
			
			System.out.println("Hello");
				
		}
		
		System.out.println("End");
		
		
	}

}
