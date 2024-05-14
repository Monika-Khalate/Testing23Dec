package constructor;

public class Test1 {

	// constructor overloading
	
	Test1()
	{
		
		System.out.println("Zero argument");
	}
	
	
	Test1(int x)
	{
		System.out.println("integer type constructor");
		
	}
	
	
	Test1(float x)
	{
		
		System.out.println("float type constructor");
	}
	
	
	Test1(char a)
	{
		System.out.println("character type constructor");
	}
	
	
	Test1(int a, char b)
	{
		
		System.out.println("int char type constructor");
	}
	
	
	Test1(char x, int y)
	{
		System.out.println("int char type constructor");
	}
	
	
	Test1(int x, int y)
	{
		System.out.println("int int type constructor");
	}
	
	
	Test1(int z, char h, int k)
	
	{
		System.out.println("int char int type constructor");

	}
	
	
	
	public static void main(String[] args) {
		new Test1();
		new Test1();
		new Test1(67);
		new Test1('%');
		new Test1(89, '&');
		new Test1('$', 54);
		new Test1(3, 67);
		new Test1(65, 'U', 90);
		new Test1(5, '@', 9);

		
		
		
	}
	
	
}



