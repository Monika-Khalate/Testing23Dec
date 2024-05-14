package accessspecifier;

import accessmodifiers.StaticMethod1;

public class StaticMethod3 {

	public static void main(String[] args) {
		
		// outside package
		
		StaticMethod1.p();   // public
	//	StaticMethod1.q();    default
	//	StaticMethod1.r();    private
	//	StaticMethod1.s();    protected
		
		
		
	}
}
