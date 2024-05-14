package stringclass;

public class ReverseString2 {
	public static void main(String[] args) {
		
		String a="Velocity Class";
		System.out.println(a);
		
		char t[]=a.toCharArray();
		
		for(int i=0; i<t.length; i++)
		{
			System.out.print(t[i]+",");
		}
		
		String z="";
		for(int i=t.length-1; i>=0; i--)
		{
			z=z+t[i];
		}
		System.out.println();
		
		a=z;
		System.out.println(a);
	}

}
