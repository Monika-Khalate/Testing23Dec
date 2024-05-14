package accessmodifiers;

public class NonStaticMethod2 {
	
	public static void main(String[] args) {
		
		// within same package
		
		NonStaticMethod1 m1 = new NonStaticMethod1();
		
		m1.p();     // public
		
		m1.q();      // default
		
	//	m1.r();      // private     not access outside class
		
		m1.s();      // protected
		
		
		
		
	}

}
