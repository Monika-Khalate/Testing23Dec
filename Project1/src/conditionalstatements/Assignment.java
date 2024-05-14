package conditionalstatements;

public class Assignment {
	
public static void main(String[] args) {
	
	
	for(int a=5; a>=1; a--)       // for number of lines
	{
		for(int b=4; b>=a; b--)  // for printing space
			
		{
			System.out.print(" ");
		}
		for (int c=1; c<=a; c++)    // for printing star
		{
			System.out.print("* ");
		}
		
		System.out.println();
		
	}
}
}
