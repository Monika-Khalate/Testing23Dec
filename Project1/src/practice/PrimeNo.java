package practice;

import java.util.Scanner;

public class PrimeNo {
	
	
	public static void main(String[] args) {
		
		
		int temp =0;
		int num;
		System.out.println("Enter the number");
		
		Scanner sc= new Scanner(System.in);
		
		num = sc.nextInt();
		
		
		for(int i=2; i<=num-1; i++ )
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		
		if(temp==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not prime number");
		}
		
		
	}

}
