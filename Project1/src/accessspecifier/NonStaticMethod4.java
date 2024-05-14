package accessspecifier;

import accessmodifiers.NonStaticMethod1;

public class NonStaticMethod4 extends NonStaticMethod1 {
	
	public static void main(String[] args) {
		
		
		// outside package with inheritance
		
		NonStaticMethod1 m1 = new NonStaticMethod1();     // super class object
		
		m1.p();         //public
		
	//	m1.q();         default
	//	m1.r();         private
	//	m1.s();         protected       can't call by super class reference variable "m1"     Normal call
		
		
		
		NonStaticMethod4 m2 = new NonStaticMethod4();       // sub class object
		
		m2.p();        // public
	//	m2.q();         default
	//	m2.r();         private
		m2.s();   // protected   can call only by using child class reference variable "m2"      Inheritance call
		
	}

}
