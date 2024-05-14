package accessspecifier;

import accessmodifiers.StaticVariable1;

public class StaticVariable3 {
	
	public static void main(String[] args) {
		
		// outside the package
		
		System.out.println(StaticVariable1.a);  //public
		
	//	System.out.println(StaticVariable1.b);  default
	//	System.out.println(StaticVariable1.c);   private
	//	System.out.println(StaticVariable1.d);   protected
		
		
	}

}
