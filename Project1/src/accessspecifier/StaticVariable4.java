package accessspecifier;

import accessmodifiers.StaticVariable1;

public class StaticVariable4 extends StaticVariable1 {
	
	public static void main(String[] args) {
		
		// outside package with inheritance
		
		
		System.out.println(StaticVariable1.a);   // public
		
	//	System.out.println(StaticVariable1.b);    default
	//	System.out.println(StaticVariable1.c);    private
		
		System.out.println(StaticVariable1.d);    // protected
		
		
	}

}
