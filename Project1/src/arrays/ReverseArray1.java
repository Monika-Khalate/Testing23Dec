package arrays;

public class ReverseArray1 {
	
	
	public static void main(String[] args) {
		
	//	int sum=0;
		
		int a [] = {12, 34, 56, 89, 90, 88};
		         //  0   1   2   3   4   5      // index
		
		        //  88  90  89  56  34  12
		
		for (int i=0; i<=(a.length-1); i++)
		{
			 System.out.print(a[i]+ " ");
			
			
		//	sum= sum+a[i];
			
		}
		
	//	System.out.println(sum);
		
		
		System.out.println();
		
		// print array in reverse order
		
		for(int i=(a.length-1); i>=0; i--)
		{
			System.out.print(a[i]+ " ");
		}
	}

}
