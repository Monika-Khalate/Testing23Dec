package accessmodifiers;

public class StaticMethod1 {
	
	public static void p()
	{
		System.out.println("public static method p");
	}
	
	
	static void q()
	{
		System.out.println("default static method q");
	}

	private static void r()
	{
		System.out.println("private static method r");
	}
	
	
	protected static void s()
	{
		System.out.println("protected static method s");
	}
	
	
	
	public static void main(String[] args) {
		
		// within same class
		
		p();   //public
		
		q();   // default
		
		r();    // private
		
		s();    // protected
		
		
	}
	
}
