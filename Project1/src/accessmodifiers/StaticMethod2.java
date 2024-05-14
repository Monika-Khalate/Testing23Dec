package accessmodifiers;

public class StaticMethod2 {
	
	public static void main(String[] args) {
		
		// within same package
		
		StaticMethod1.p();           // public
		
		StaticMethod1.q();         // default
		
	//	StaticMethod1.r();        private      not access outside class
		
		StaticMethod1.s();          //protected
	}

}
