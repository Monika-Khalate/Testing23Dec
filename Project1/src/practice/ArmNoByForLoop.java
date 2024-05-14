package practice;

import java.util.Scanner;

public class ArmNoByForLoop {
	
	public static void main(String[] args) {
		
		int a;
		int arm=0;
		int n;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	    n= sc.nextInt();
	    temp=n;
	    for( n =0; n!=0; n/=10)
	    {
	     a=n%10;
	    arm=arm+(a*a*a);
	    
	    }
		
	    if(arm==temp)
	    {
	    	System.out.println(temp +" Armstrong number");
	    }
	    else
	    {
	    	System.out.println(temp+ " Not Armstrong number");
	    }
		
	}

}
