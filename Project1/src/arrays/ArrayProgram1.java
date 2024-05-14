package arrays;

public class ArrayProgram1 {
	
	public static void main(String[] args) {
		
		int a [] = {12,34,56,89,90,88} ;
		
		int size= a.length;
		System.out.println("size = " + size);
		
		int lastIndex = size - 1;
		System.out.println("Last Index= " + lastIndex);
		
		
		// for(int i=0; i<=(a.length-1); i++)
		
		for(int i=0; i<(a.length); i++)
		{
			System.out.println(a[i]);
		}
	}

}
