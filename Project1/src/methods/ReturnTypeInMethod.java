package methods;

public class ReturnTypeInMethod {

	 
	   // Return Type:- output from method
	static int add(int a, int b)
	{
		int c= a+b;
		System.out.println("c = " +c);
		return c;

	}
	

	public static void main(String[] args) {
		
		System.out.println("start");
		
		// method output stored in variable
		int r= add(10,12);
		
		System.out.println("r = " + r);
	}
}
