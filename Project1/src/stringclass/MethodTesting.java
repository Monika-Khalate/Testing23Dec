package stringclass;

public class MethodTesting {
	public static void main(String[] args) {
		
		String a="Velocity class Pune class Testing Class 2020";
		String b="The price is 4000Rs";
		
		String x=a.substring(4);
		System.out.println(x);
		
		x=a.substring(4, 10);     // sub string from index 4 to (10-1)
		System.out.println(x);
		
		x=a.replace('e', 'X');
		System.out.println(x);
		
		System.out.println(a);
		x=a.replace("class", "Batch");
		System.out.println(x);
		
		
		x=a.replaceAll("class", "software");
		System.out.println(x);
		
		x=a.replaceFirst("class", "morning");      // replace string of 1st match only
		System.out.println(x);
		
	}

}
