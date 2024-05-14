package accessspecifier;

import accessmodifiers.NonStaticVariable1;

public class NonStaticVariable4 extends NonStaticVariable1 {
	
	public static void main(String[] args) {
		
		// outside package with inheritance
		
		NonStaticVariable1  var = new NonStaticVariable1();   // super class object
		
		 
		System.out.println(var.a);    // public
	//	System.out.println(var.b);    default
	//	System.out.println(var.c);     private
	//	System.out.println(var.d);     protected      can't call by super class reference variable "var"
		                              // Normal call
		
		
		NonStaticVariable4 v = new  NonStaticVariable4();      // child class object
		
		
		System.out.println(v.a);          // public
	//	System.out.println(v.b);          default
	//	System.out.println(v.c);          private
		System.out.println(v.d);       // protected    can call only by using child class reference variable "v"
	                                     // Inheritance call
	                                 
	
	}
	

}
