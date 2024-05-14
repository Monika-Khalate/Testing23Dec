package accessmodifiers;

public class NonStaticMethod1 {
	
	public void p()
	{
		System.out.println("public non-static method p");
	}
	
	
	 void q()
	{
		System.out.println("default non-static method q");
	}

	private void r()
	{
		System.out.println("private non-static method r");
	}
	
	
	protected void s()
	{
		System.out.println("protected non-static method s");
	}
	
	
	
	public static void main(String[] args) {
		
		// within same class
		
		NonStaticMethod1 m1 = new NonStaticMethod1();
		
		m1.p();       // public
		m1.q();       // default 
		m1.r();       // private
		m1.s();       // protected
		
		
		
		
	}

}
