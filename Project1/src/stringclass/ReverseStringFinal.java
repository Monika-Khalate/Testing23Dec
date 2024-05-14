package stringclass;

public class ReverseStringFinal {
	public static void main(String[] args) {
		
		String a="Velocity Class";
		System.out.println(a);
		
		// char t[] = a.toCharArray();
		
		String z ="";
		for(int i=a.length()-1; i>=0; i--)
		{
			z=z+a.charAt(i);
		}
		
	      a=z;
	      System.out.println(a);
	
	}

}
