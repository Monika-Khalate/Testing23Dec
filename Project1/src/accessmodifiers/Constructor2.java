package accessmodifiers;

public class Constructor2 {
	
	public static void main(String[] args) {
		
		
		// within same package
		
		//Constructor1  con =new Constructor1();
		
		new Constructor1();
		new Constructor1(24);
	//	new Constructor1(29, 'h');  private  not access outside class
		new Constructor1(true);
	}

}
