package conditionalstatements;

import java.util.Scanner;

public class Testing4 {
	public static void main(String[] args) {
		int a;
		long c;
		String power;
		
		Scanner s = new Scanner(System.in);   // scanner is used to enter input from user
		
		System.out.println("Enter number");
		a=s.nextInt();  // for entering integer
		
		System.out.println("Enter power");
		power= s.next(); // for entering string
		
		switch(power)
		{
		case "square": c=a*a;
		
		              System.out.println(c);
		              break;
		              
		              
		case "cube": c=a*a*a;
		            System.out.println(c); 
		            break;
		            
		            
		default:System.out.println("not supported 1" + power);            
		        System.out.println("Enter valid input");
		        
		}
		
	}

}
