package stringclass;

public class StringClassMethods {
	
	public static void main(String[] args) {
		
		String a= "Velocity";
		String b="                 Velocity batchtesting pune 2023";
		
		String c="         n        Velocity batchtesting pune 2023";
		
				
				
		char x [] = a.toCharArray();
		
		for(int i = 0; i<x.length; i++)
		{
			System.out.println(x[i]);
		}
		
		boolean r=b.contains("batch");
		System.out.println(r);
		
		
		 r=b.contains("Batch");
		System.out.println(r);
		
		
		// remove starting and ending SPACE from string
		String y=b.trim();
		System.out.println(b);
		System.out.println(y);
		
		System.out.println("----------------------------");
		y= c.trim();
		System.out.println(c);
		System.out.println(y);
	}
	
	

}
