package arrays;

public class ReverseArray2 {
	
	public static void main(String[] args) {
		
		
		int a[]= {12, 34, 56,89, 90, 88};
		
		
		for(int i=0; i<=(a.length-1); i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
		System.out.println();
		
		
		
		// Reverse
		
//		int b[]=new int[a.length];
//		
//		
//		for(int i=0; i<=(a.length-1); i++)
//		{
//			
//			b[i] = a[(a.length-1)-i];
		
		   
		    		
//			
//		}
		
		
		// Reverse
		
		int b[]=new int[a.length];
		
		int j= a.length-1;
		
		for(int i=0; i<=(a.length-1); i++)
		{
			b[i]=a[j];
			j--;
		}
		                 
//		b[5] = a[0];     
//		b[4] = a[1];     
//		b[3]= a[2];
//		b[2]= a[3];
//		b[1]= a[4];
//		b[0]= a[5];
		
		
		
		
		a=b;
		
//		a[0]=b[0];
//		a[1]=b[1];
//		a[2]=b[2];
//		a[3]=b[3];
//		a[4]=b[4];
//		a[5]=b[5];
		
		
		for(int i=0; i<=(a.length - 1); i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
