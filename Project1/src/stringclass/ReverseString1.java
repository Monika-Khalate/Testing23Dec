package stringclass;

public class ReverseString1 {

public static void main(String[] args) {
	
	String a="Velocity Class";
	System.out.println(a);
	
	char t[]=a.toCharArray();
	
	for(int i=0; i<t.length; i++)
	{
		System.out.print(t[i]+",");
	}
	
	char x;
	for(int i=0; i<t.length/2; i++)
			{
		      x=t[i];
		      t[i]=t[(t.length-1)-i];
		      t[(t.length-1)-i]=x;
			}
	
	String z="";
	for(int i=0; i<t.length; i++)
	{
		z=z+t[i];	
	}
	System.out.println();
	
	a=z;
	System.out.println(a);
}

}