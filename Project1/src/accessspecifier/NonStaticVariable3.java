package accessspecifier;

import accessmodifiers.NonStaticVariable1;

public class NonStaticVariable3 {
	
	public static void main(String[] args) {
		
		// outside the package
		
		NonStaticVariable1  var = new NonStaticVariable1();
		
		System.out.println(var.a);     // public
		
	//	System.out.println(var.b);     default
		
	//	System.out.println(var.c);      private
		
	//	System.out.println(var.d);       protected
		
	}

}
