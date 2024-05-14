package stringclass;

public class StringReverseAtSamePosition {
	
	public static void main(String[] args) {
		
//		String a="Velocity Class";
//		System.out.println(a);
//		
//		System.out.println("----------------------");
//		
//		String x[]=a.split(" ");
//		for(int i=0; i<x.length; i++)
//		{
//			System.out.print(x[i]);
//		}
//			
//		System.out.println();
//	
//		System.out.println("---------------------------");
//		
//		String y=x[0];
//		System.out.println(y);
//		String z=x[1];
//		System.out.println(z);
//		
//		System.out.println("-------------------------");
//		String p ="";
//		for(int i=y.length()-1; i>=0; i--)
//		{
//			p=p+y.charAt(i);
//		}
//		
//	      y=p;
//	      System.out.println(y);
//	      
//	      
//	      
//	      String q ="";
//			for(int i=z.length()-1; i>=0; i--)
//			{
//				q=q+z.charAt(i);
//			}
//			
//		      z=q;
//		      System.out.println(z);
//	    
//		      System.out.println("-----------------------");
//	      
//	     String r=y+" "+z;
//	     System.out.println(r);
		
		
		String a ="Velocity Class";
		System.out.println(a);
		
		String b[]=a.split(" ");
		
		for(int i=0; i<=b.length-1; i++)
		{
			String c=b[i];
			
			for(int j=c.length()-1; j>=0; j--)
			{
				System.out.print(c.charAt(j));
			}
			
			System.out.print(" ");
		}
		
		
		
	      
	}
	

}
