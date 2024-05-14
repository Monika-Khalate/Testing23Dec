package practice;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		
		int fact=1;
		int n;
		
		
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
			
		}
		
		System.out.println("Factorial of given no. is " + fact);
	}

}
