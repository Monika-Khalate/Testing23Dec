package arrays;

public class ReverseArrayBySwapping {
	
	public static void main(String[] args) {
		
	int a[]= {12,34,56,89,90}	;
	
	for(int i=0; i<=(a.length-1); i++)
	{
		
		System.out.print(a[i]+ " ");
		
	}
		System.out.println();
		
		// Reverse Swap
		
		int c;
		
		
		for(int i=0; i<=(a.length-1)/2; i++)     
		{
			
		c = a[i];
		a[i] = a[(a.length-1)-i]; //  a[index]-i
		a[(a.length-1)-i] = c;
			
		}
		
		
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
