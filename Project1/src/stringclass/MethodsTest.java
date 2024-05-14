package stringclass;

public class MethodsTest {
	
	public static void main(String[] args) {
		
		String a="Velocity class pune Testing 2020";
		String b="2023";
		
		
		String c[]= a.split(" ");
		
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
			
		System.out.println("-----------------------------");
		
		
		a="Velocity Batch class batch Pune Abatch Testing 2020 batch Test";
		
		String []d=a.split("batch");
		for(int i=0; i<d.length; i++)
		{
			System.out.println(d[i]);
		}
	}

}
