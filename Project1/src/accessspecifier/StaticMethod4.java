package accessspecifier;

import accessmodifiers.StaticMethod1;

public class StaticMethod4 extends StaticMethod1 {
	
	public static void main(String[] args) {
		
		
		// outside package with inheritance
		
		StaticMethod1.p();        // public
		
	//	StaticMethod1.q();       // default
	//	StaticMethod1.r();       // private
		
		StaticMethod1.s();        // protected
		
	}

}
