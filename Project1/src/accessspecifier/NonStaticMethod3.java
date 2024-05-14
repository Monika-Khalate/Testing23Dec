package accessspecifier;

import accessmodifiers.NonStaticMethod1;

public class NonStaticMethod3 {
	
	
	public static void main(String[] args) {
		
		// outside the package
		
		NonStaticMethod1 m1 = new NonStaticMethod1();
		
		m1.p();     //   public
		
	//	m1.q();       default
	//	m1.r();       private
	//	m1.s()        protected
		
		
		
	}

}
