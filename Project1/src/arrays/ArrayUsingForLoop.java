package arrays;

public class ArrayUsingForLoop {
	
	public static void main(String[] args) {
		
		
		int a[]= {12, 34, 56, 89, 90};  // size= 5
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("--------------------------------------------------");
		
		
		int x=0;
		
		// repeation = 5 times
		
		for(int i=1; i<=5; i++)
			
		{
			System.out.println(a[x]);
			
			x++;
		}
		
//System.out.println(".............................................................");		
//		
//		// repeation = 5 times
//		
//		for(int i=0; i<=4; i++)       // here loop variable used as index in array
//		{
//			System.out.println(a[i]);
//		}
		
	}

}
