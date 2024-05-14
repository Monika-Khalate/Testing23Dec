package accessmodifiers;

public class StaticVariable2{
	
	public static void main(String[] args) {
		
		
		
	// within same package
		
		
		
		System.out.println(StaticVariable1.a);   //public
		
		System.out.println(StaticVariable1.b);    // default
		
	//	System.out.println(StaticVariable1.c);    // private. can't access outside its class.
		
		System.out.println(StaticVariable1.d);    //protected
		
	}

}
