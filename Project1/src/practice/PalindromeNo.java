package practice;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		
		int temp =num;
		int reverse=0;
		
		while(temp>0)
		{
			int rem =temp % 10;
			reverse=reverse*10+rem;
			temp=temp/10;
		}
		
		if (num==reverse)
		{
			System.out.println("Palindrome number");
		}
		
		else
		{
			System.out.println("Not Palindrome number");
		}
}
	
}
