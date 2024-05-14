package accessmodifiers;

public class NonStaticVariable2 {

	public static void main(String[] args) {
		
		
		// within same package
		
		NonStaticVariable1  var = new NonStaticVariable1();
		
		System.out.println(var.a); // public
		
		System.out.println(var.b);  //default
		
	//	System.out.println(var.c);   private. not access outside class
		
		System.out.println(var.d);     // protected
	}
}
