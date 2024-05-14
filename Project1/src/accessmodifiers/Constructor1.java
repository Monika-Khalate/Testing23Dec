package accessmodifiers;

public class Constructor1 {
	
	
	public Constructor1()
	{
		System.out.println("public constructor with zero argument");
	}
	
	Constructor1(int a)
	{
		System.out.println("default constructor with int argument");
	}
	
	private Constructor1(int b, char c)
	{
		System.out.println("private constructor with int & char argument");
	}

	protected Constructor1(boolean d)
	{
		System.out.println("protected constructor with boolean argument");
	}
	
	
	
	public static void main(String[] args) {
		
		// within same class
		
		Constructor1  con =new Constructor1();
		
		
		new Constructor1(24);
		
		new Constructor1(29, 'h');
		
		new Constructor1(true);
		
	}
	
}
